package testcase;

import java.util.Date;

import testcase.result.HotelListResult;
import elong.HotelDetailCondition;;

public class HotelDetailTester  extends BaseTester<HotelDetailCondition, HotelListResult> {

	@Override
	public String method() {
		return "hotel.detail";
	}


	@Override
	public boolean isRequiredSSL() {
		return false;
	}

	
	@Override
	public HotelDetailCondition getConditon() {
		HotelDetailCondition condition = new HotelDetailCondition();
				
			
			Date date = new Date();
			Date date2 = util.Tool.addDate(date, 1);
			
			condition.setArrivalDate(date);
			condition.setDepartureDate(date2);
			condition.setHotelIds("10101129");
			
		
		
		return condition;
	}

	
}
