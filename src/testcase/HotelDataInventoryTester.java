package testcase;

import java.util.Date;

import testcase.result.HotelDataInventoryResult;
import elong.InventoryCondition;;

public class HotelDataInventoryTester  extends BaseTester<InventoryCondition, HotelDataInventoryResult> {

	@Override
	public String method() {
		return "hotel.data.inventory";
	}

	@Override
	public boolean isRequiredSSL() {
		return false;
	}

	

	@Override
	public InventoryCondition getConditon() {
		InventoryCondition condition = new InventoryCondition();
				
			
			Date date = new Date();
			Date date2 = util.Tool.addDate(date, 1);
			
			condition.setStartDate(date);
			condition.setEndDate(date2);
			condition.setHotelIds("10101129");
			
		
		
		return condition;
	}

}