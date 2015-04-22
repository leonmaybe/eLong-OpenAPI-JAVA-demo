package testcase;

import testcase.result.HotelOrderDetailResult;
import elong.OrderIdCondition;;

public class HotelOrderDetailTester extends BaseTester<OrderIdCondition, HotelOrderDetailResult> {

	@Override
	public String method() {
		return "hotel.order.detail";
	}
	
	@Override
	public boolean isRequiredSSL() {
		return true;
	}
	

	@Override
	public OrderIdCondition getConditon() {
		OrderIdCondition condition = new OrderIdCondition();

			condition.setOrderId(67740752);
		
		
		return condition;
	}

	

	
}