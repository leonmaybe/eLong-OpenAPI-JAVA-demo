package testcase.result;

import com.alibaba.fastjson.annotation.JSONField;


public class BaseResult {

	 	@JSONField(name="Code")
		private String code;
	 	
		 
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		
}
