package HomeAppliance.ConsoleApplication;

import java.io.Serializable;
import java.util.Comparator;


public class CustomerDetails implements Comparable<CustomerDetails>,Serializable
{
	private String CustomerName;
	private long MoblieNumber;
	private String CustomerAdvisor;
	private String CustomerNeeds;
	private double CustomerExpectPrice;
	@Override
	public int compareTo(CustomerDetails o) 
	{
		return this.CustomerName.compareTo(o.CustomerName);
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public long getMoblieNumber() {
		return MoblieNumber;
	}
	public void setMoblieNumber(long moblieNumber) {
		MoblieNumber = moblieNumber;
	}
	public String getCustomerAdvisor() {
		return CustomerAdvisor;
	}
	public void setCustomerAdvisor(String customerAdvisor) {
		CustomerAdvisor = customerAdvisor;
	}
	public String getCustomerNeeds() {
		return CustomerNeeds;
	}
	public void setCustomerNeeds(String customerNeeds) {
		CustomerNeeds = customerNeeds;
	}
	public double getCustomerExpectPrice() {
		return CustomerExpectPrice;
	}
	public void setCustomerExpectPrice(double customerExpectPrice) {
		CustomerExpectPrice = customerExpectPrice;
	}
	public CustomerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerDetails(String customerName, long moblieNumber, String customerAdvisor, String customerNeeds,
			double customerExpectPrice) {
		super();
		CustomerName = customerName;
		MoblieNumber = moblieNumber;
		CustomerAdvisor = customerAdvisor;
		CustomerNeeds = customerNeeds;
		CustomerExpectPrice = customerExpectPrice;
	}
	@Override
	public String toString() {
		return "CustomerDetails [CustomerName=" + CustomerName + ", MoblieNumber=" + MoblieNumber + ", CustomerAdvisor="
				+ CustomerAdvisor + ", CustomerNeeds=" + CustomerNeeds + ", CustomerExpectPrice=" + CustomerExpectPrice
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}

