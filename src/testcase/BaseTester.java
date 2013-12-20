package testcase;

import java.io.*;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType; 
import java.util.Date;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.DateFormatDeserializer;



public abstract class BaseTester<T,T2> {

	private static String appUser = null;
	protected static String appKey = null;
	private static String appSecret = null;
	private static double version = 1.1;
	private static elong.EnumLocal locale = elong.EnumLocal.en_US;
	
	private static String serverHost = null;
	
	private static ParserConfig parserConfig = new com.alibaba.fastjson.parser.ParserConfig(); 
	static { 
		DateFormatDeserializer d = new DateFormatDeserializer();
		parserConfig.putDeserializer(Date.class, d);
	} 
	
	
	private  void loadConf() {
		String path = this.getClass().getResource("/test.conf").getPath();  
		File file = new File(path);
        BufferedReader reader = null;
        try {
            
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            
            while ((tempString = reader.readLine()) != null) {
            	String[] arr = tempString.split("=");
            	if(arr!=null && arr.length == 2) {
            		String name = arr[0].trim();
            		String value = arr[1].trim();
            		
            		if("appUser".equals(name)) {
            			appUser = value;
            		} else if("appKey".equals(name)) {
            			appKey = value;
            		} else if("appSecret".equals(name)) {
            			appSecret = value;
            		} else if("serverHost".equals(name)) {
            			serverHost = value;
            		} else if("version".equals(name)) {
            			version = Double.parseDouble(value);
            		} else if("locale".equals(name)) {
            			if("en_US".equals(value)) {
            				locale = elong.EnumLocal.en_US;
            			} else {
            				locale = elong.EnumLocal.zh_CN;
            			}
            		}
            	}
                
            }
            reader.close();
        } catch (IOException e) {
        	 System.out.println("ERROR - failed to load conf from test.conf\r\n");
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        
        if(appUser == null || appUser.equals("")) {
        	 System.out.println("ERROR - plz conf appUser in  test.conf\r\n");
		} else if(appKey == null || appKey.equals("")) {
			System.out.println("ERROR - plz conf appKey in  test.conf\r\n");
		} else if(appSecret == null || appSecret.equals("")) {
			System.out.println("ERROR - plz conf appSecret in  test.conf\r\n");
		} else if(serverHost == null || serverHost.equals("")) {
			System.out.println("ERROR - plz conf serverHost in  test.conf\r\n");
		}
        
	}
	
	
	public Class < T2 >  T2Class = null;
	@SuppressWarnings("unchecked")
	public BaseTester(){
		ParameterizedType type =(ParameterizedType) (getClass().getGenericSuperclass());
		
		 java.lang.reflect.Type[]  types = type.getActualTypeArguments(); 
		 if(types!= null && types.length >1) {
			 T2Class  =  (Class < T2 > ) types[ 1 ];
		 }
		
		 loadConf();
	}
	
	
	public abstract String method() ;
	public abstract T getConditon();
	public abstract boolean isRequiredSSL();
	private boolean isVerbosed = false;
	
	public void setVerbose(boolean v) {
		isVerbosed = v;
	}
	
	private String format = "json";
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}

	
	
	
	private String responseData;
	
	public T2 Test () {
		
			if(appUser == null || appUser.equals("")) {
				System.out.println("please set appUser and keys.");
				return null;
			}
			T2 result = null;
	    
	    try {
	    	
	    	T t = this.getConditon();
	    	BaseRequst<T> req = new BaseRequst<T>();
	    	req.Version = version;
	    	req.Local = locale;
	    	req.Request = t;
	    	
			String str = null;
			if(format.equals("xml")) {
				str = this.objectToXml(req);
			}else {
				str = this.objectToJson(req);
			}
			
			//str = this.objectToXml(req);
	        System.out.println(str);
	        
	        long epoch = System.currentTimeMillis()/1000;
	        String sig = util.Tool.md5(epoch + util.Tool.md5(str + appKey) + appSecret);
	        
	        
	        String url = "http"+(this.isRequiredSSL() ? "s": "")+"://"+serverHost+"/rest?format="+ this.format +"&method=";
	        url += this.method();
	        url += "&user="+ appUser +"&timestamp=";
	        url += epoch;
	        url += "&signature=";
	        url += sig;
	        url += "&data=" + util.Tool.encodeUri(str);;
	        
	        System.out.println();
	        System.out.println(url);
	        
			responseData = util.Http.Send("GET", url, "");
			
			responseData = responseData.trim();
			//responseData = responseData.replaceAll("\n", "");
			responseData = responseData.replaceAll("0001-01-01T00:00:00", "2001-01-01T00:00:00");
			
//			if(format.equals("xml")) {
//				responseData = responseData.replaceFirst("Result", "ApiResult");
//				responseData = responseData.substring(0, responseData.length() - "/Result>".length()) + "/ApiResult>";
//			}
			if(isVerbosed) {
				System.out.println();
				System.out.println(responseData);
			}
	        result = this.jsonToObject(responseData);
	        
	        
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    return result;
	    
	}
	
	
	public String objectToJson(Object value) {
		
		String str = null;
		
		str = JSON.toJSONStringWithDateFormat(value, "yyyy-MM-dd HH:mm:ss");
		
		return str;
	}
	
	@SuppressWarnings("unchecked")
	public T2 jsonToObject(String str) {
		
		return (T2)JSON.parseObject(str, T2Class ,Feature.AllowISO8601DateFormat);
	}
	
	@SuppressWarnings("unchecked")
	public T2 xmlToObject(String str) {
		JAXBContext context = null;		
        T2 obj = null;
        
		try {
			context = JAXBContext.newInstance(T2Class);
			StringReader reader = new StringReader(str);
	        Unmarshaller unmar = context.createUnmarshaller();
			obj = (T2)unmar.unmarshal(reader);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
	
	public String objectToXml(Object value) {
		String str = null;
		
		JAXBContext context = null;
	    
	    StringWriter writer = null;
		try {
			
		    context = JAXBContext.newInstance(value.getClass());
			Marshaller mar = context.createMarshaller();
	        writer = new StringWriter();
	        mar.marshal(value, writer);
	        str = writer.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
		}finally {
			if(context != null) context = null;
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				writer = null;
			}
		}
	    
        return str;
	}
	public String getResponseData() {
		return responseData;
	}
	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}
}
