package testcase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import testcase.result.HotelOrderCreateResult;
import util.Tool;
import elong.Contact;
import elong.CreateOrderCondition;
import elong.CreateOrderRoom;
import elong.CreditCard;
import elong.Customer;
import elong.EnumIdType;


public class HotelOrderCreateTester extends
		BaseTester<CreateOrderCondition, HotelOrderCreateResult> {
	@Override
	public String method() {
		return "hotel.order.create";
	}
	
	@Override
	public boolean isRequiredSSL() {
		return true;
	}
	

	@Override
	public CreateOrderCondition getConditon() {
		CreateOrderCondition condition = new CreateOrderCondition();
			Date date = new Date();
			date = util.Tool.addDate(date, 1);
			Date date2 = util.Tool.addDate(date, 1);
			Date date3 = util.Tool.addDate(date, 0);
			date3.setHours(15);
			date3.setMinutes(0);
			date3.setSeconds(0);
			Date date4 = util.Tool.addDate(date, 0);
			date4.setHours(17);
			date4.setMinutes(0);
			date4.setSeconds(0);
			
			condition.setHotelId("10101129");
			condition.setRoomTypeId("0010");
			condition.setRatePlanId(145742);
			condition.setTotalPrice(new BigDecimal(600));
			condition.setAffiliateConfirmationId("my-order-id-2");
			
			condition.setArrivalDate(date);
			condition.setConfirmationType(elong.EnumConfirmationType.NotAllowedConfirm);
			condition.setContact(getContact());
			condition.setCreditCard(getCreditCard());
			condition.setCurrencyCode(elong.EnumCurrencyCode.HKD);
			condition.setCustomerIPAddress("211.151.230.21");
			condition.setCustomerType(elong.EnumGuestTypeCode.OtherForeign);
			condition.setDepartureDate(date2);
			condition.setEarliestArrivalTime(date3);
			condition.setExtendInfo(null);			
			condition.setInvoice(null);
			condition.setIsForceGuarantee(false);
			condition.setIsGuaranteeOrCharged(false);
			condition.setIsNeedInvoice(false);
			condition.setLatestArrivalTime(date4);
			condition.setNightlyRates(null);
			condition.setNoteToElong("");
			condition.setNoteToHotel(null);
			condition.setNumberOfCustomers(1);
			condition.setNumberOfRooms(1);
			condition.setOrderRooms( getRooms() );
			condition.setPaymentType(elong.EnumPaymentType.SelfPay);
			condition.setSupplierCardNo(null);
			
			
		
		return condition;
	}
	
	List<CreateOrderRoom> getRooms() {
		
		List<Customer> customers = new ArrayList<Customer>(1);
		Customer c = new Customer();
		c.setName("Jack White");
		customers.add(c);
		
		List<CreateOrderRoom> rooms = new ArrayList<CreateOrderRoom>(1);
		CreateOrderRoom room = new CreateOrderRoom();
		room.setCustomers(customers);
		rooms.add(room);
		
		return rooms;
	}
	
	Contact getContact() {
		Contact c = new Contact();
		c.setName("Ms White");
		c.setMobile("18600000001");
		
		return c;
	}

	CreditCard getCreditCard() {
		CreditCard cc = new CreditCard();
		
		
		String num = "4033910000000000"; // CREDIT CARD FOR TEST ENV
		long ts = System.currentTimeMillis()/1000;
		String key = appKey.substring(appKey.length()-8, appKey.length());
		System.out.println("Key: "+ key);
		
		try {
			num = ts + "#" + num;
			
			System.out.println("raw data before DES: "+ num);
			num = Tool.encryptDES(num, key);
			System.out.println("DES encrypt result: "+ num);
			System.out.println();
			
			
			cc.setCVV( Tool.encryptDES( ts + "#" + "007", key));
			cc.setExpirationMonth(10);  
			cc.setExpirationYear(2016);
			cc.setHolderName( Tool.encryptDES( ts + "#" + "NEED Real HolderName", key));
			cc.setIdType(EnumIdType.IdentityCard);
			cc.setIdNo( Tool.encryptDES( ts + "#" + "110101198205169939", key));
			cc.setNumber(num);
			
			
		} catch (Exception e) {
			//TODO .....
			e.printStackTrace();
		}
		
		//cc = null;
		return cc;
	}
	
}
