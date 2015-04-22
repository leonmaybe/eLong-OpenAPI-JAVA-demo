package testcase.result;

import com.alibaba.fastjson.annotation.JSONField;

import elong.CreateOrderResult;

public class HotelOrderCreateResult extends BaseResult {
	@JSONField(name="Result")
	private CreateOrderResult result;
	
	public CreateOrderResult getResult() {
		return result;
	}
	public void setResult(CreateOrderResult result) {
		this.result = result;
	}
}
