package testcase.result;

import com.alibaba.fastjson.annotation.JSONField;

import elong.InventoryResult;

public class HotelDataInventoryResult extends BaseResult {

	
		 @JSONField(name="Result")
		private InventoryResult result;
		
		public InventoryResult getResult() {
			return result;
		}
		public void setResult(InventoryResult result) {
			this.result = result;
		}
}
