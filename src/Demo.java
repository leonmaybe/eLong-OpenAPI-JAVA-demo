import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import util.*;

import testcase.*;
import testcase.result.*;
import elong.*;

 

public class Demo {

	public static void main(String[] args) {
		
		/**
		 * Instructions:
		 * 
		 * a) edit hosts, append the below line :
		 * 		211.151.230.212 api.elong.com
		 * b) configure test.conf with your API user name and keys
		 * 
		 */
		
		//run a test case
		
		//TestHotelList();		
		//TestHotelDetail();	
		
		//TestHotelDataInventory();
		
		TestHotelOrderCreate();
		//TestHotelOrderCancel();
		//TestHotelOrderDetail();
		
		//TestHotelDataValidate();
		
		
//		//Test credit card DES encrypt
//		try {
//			String num = Tool.encryptDES("1386230862#4033910000000000", "51681602");
//			System.out.println("result: "+ num);
//			String expect ="de00a1c63eed569f31ccc48159b38752fe66011df414caacb006cb18b9444db7";
//			System.out.println("expect: " + expect);
//			System.out.println("matched: "+num.equals(expect));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
	}
	
	static void TestHotelOrderDetail() {
		HotelOrderDetailTester  tester = new HotelOrderDetailTester();
		HotelOrderDetailResult result =  tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			OrderDetailResult data = result.getResult();
			if(data != null) {
				System.out.println(data.getTotalPrice());
			}
			
		} else {
			System.out.println("NULL Result!!");
		}
	}
	
	static void TestHotelOrderCreate() {
		HotelOrderCreateTester  tester = new HotelOrderCreateTester();
		HotelOrderCreateResult result =  tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			CreateOrderResult data = result.getResult();
			if(data != null) {
				System.out.println(data.getOrderId());
			}
			
		} else {
			System.out.println("NULL Result!!");
		}
	
	}
	
	
	static void TestHotelOrderCancel() {
		HotelOrderCancelTester  tester = new HotelOrderCancelTester();
		HotelOrderCancelResult result =  tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			CancelOrderResult data = result.getResult();
			if(data != null)
				System.out.println(data.isSuccesss());
			
		} else {
			System.out.println("NULL Result!!");
		}
	
	}
	
	static void TestHotelDataInventory() {
		HotelDataInventoryTester tester = new HotelDataInventoryTester();
		HotelDataInventoryResult result =  tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			InventoryResult data = result.getResult();
			if(data != null && data.getInventories() != null)
			System.out.println(data.getInventories().size());
			
		} else {
			System.out.println("NULL Result!!");
		}
	}
	
	static void TestHotelDataValidate() {
		HotelDataValidateTester tester = new HotelDataValidateTester();
		HotelDataValidateResult result =  tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			ValidateResult data = result.getResult();
			if(data != null) {
				if(data.getResultCode() == EnumValidateResult.OK)
					System.out.println(data.getCancelTime());
				else {
					System.out.println(data.getResultCode());
					System.out.println(data.getErrorMessage());
				}
			}else {
				
			}
			
		} else {
			System.out.println("NULL Result!!");
		}
	}
	
	static void TestHotelDetail() {
		HotelDetailTester tester = new HotelDetailTester();
		tester.setVerbose(true);
		
		HotelListResult result = tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			HotelList data = result.getResult();
			System.out.println(data.getCount());
			System.out.println(data.getHotels().size());
		} else {
			System.out.println("NULL Result!!");
		}
	}
	
	static void TestHotelList() {
		HotelListTester tester = new HotelListTester();
		HotelListResult result = tester.Test();
		if(result != null) {
			System.out.println();
			System.out.println(result.getCode());
			
			HotelList data = result.getResult();
			System.out.println(data.getCount());
			System.out.println(data.getHotels().size());
		} else {
			System.out.println("NULL Result!!");
		}
	}
	
	// The below code is just only for https  in test env.
	static {
	    HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier()
	        {
	    		@Override
	            public boolean verify(String hostname, SSLSession session)
	            {
	                if (hostname.equals("211.151.230.212") || hostname.equals("192.168.9.51"))
	                    return true;
	                return false;
	            }
	        });
	}
	
}
