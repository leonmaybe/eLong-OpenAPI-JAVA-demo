package testcase;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import elong.EnumLocal;

@XmlRootElement(name = "Condition")
@XmlSeeAlso({elong.HotelListCondition.class})
public class BaseRequst<T> {

	@XmlElement(name = "Version")
	public double Version;
	
	@XmlElement(name = "Local")
    public EnumLocal Local;

	@XmlElement(name = "Request")
    public T Request;
	
}
