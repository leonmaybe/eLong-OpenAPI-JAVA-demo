package testcase.result;

import com.alibaba.fastjson.annotation.JSONField;

import elong.CancelOrderResult;;

public class HotelOrderCancelResult extends BaseResult {
	 	@JSONField(name="Result")
		private CancelOrderResult result;
		
		public CancelOrderResult getResult() {
			return result;
		}
		public void setResult(CancelOrderResult result) {
			this.result = result;
		}
}
