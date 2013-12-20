package testcase;

import java.util.Date;

import testcase.result.HotelOrderCancelResult;
import elong.CancelOrderCondition;;

public class HotelOrderCancelTester  extends BaseTester<CancelOrderCondition, HotelOrderCancelResult> {

	@Override
	public String method() {
		return "hotel.order.cancel";
	}
	
	@Override
	public boolean isRequiredSSL() {
		return true;
	}
	

	@Override
	public CancelOrderCondition getConditon() {
		CancelOrderCondition condition = new CancelOrderCondition();

			condition.setOrderId(67740752);
			condition.setCancelCode("");
			condition.setReason("");
		
		
		return condition;
	}

	

	
}