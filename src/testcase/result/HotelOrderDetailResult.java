package testcase.result;

import com.alibaba.fastjson.annotation.JSONField;

import elong.OrderDetailResult;

public class HotelOrderDetailResult extends BaseResult {
	@JSONField(name="Result")
	OrderDetailResult result;
	
	public OrderDetailResult getResult() {
		return result;
	}
	public void setResult(OrderDetailResult result) {
		this.result = result;
	}
}
