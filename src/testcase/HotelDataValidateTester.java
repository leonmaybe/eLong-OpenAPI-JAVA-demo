package testcase;

import java.math.BigDecimal;
import java.util.Date;

import testcase.result.HotelDataValidateResult;
import elong.ValidateCondition;;

public class HotelDataValidateTester   extends BaseTester<ValidateCondition, HotelDataValidateResult> {

	@Override
	public String method() {
		return "hotel.data.validate";
	}

	@Override
	public boolean isRequiredSSL() {
		return false;
	}

	

	@Override
	public ValidateCondition getConditon() {
		ValidateCondition condition = new ValidateCondition();
				
			
			Date date = new Date();
			Date date2 = util.Tool.addDate(date, 1);
			Date date3 = new Date();
			date3.setHours(15);
			date3.setMinutes(0);
			date3.setSeconds(0);
			Date date4 = new Date();
			date4.setHours(17);
			date4.setMinutes(0);
			date4.setSeconds(0);
			
			condition.setArrivalDate(date);
			condition.setDepartureDate(date2);
			condition.setHotelId("10101129");
			condition.setRoomTypeId("0001");
			condition.setRatePlanId(90257);
			condition.setNumberOfRooms(1);
			condition.setTotalPrice(new BigDecimal(500));
			condition.setEarliestArrivalTime(date3);
			condition.setLatestArrivalTime(date4);
			
		
		
		return condition;
	}

}