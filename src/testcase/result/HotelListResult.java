package testcase.result;

import com.alibaba.fastjson.annotation.JSONField;

import elong.HotelList;

public class HotelListResult extends BaseResult {


	 @JSONField(name="Result")
	private HotelList result;

	public HotelList getResult() {
		return result;
	}
	public void setResult(HotelList result) {
		this.result = result;
	}
	 
	 
}
