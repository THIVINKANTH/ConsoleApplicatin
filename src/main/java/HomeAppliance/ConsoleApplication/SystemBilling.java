package HomeAppliance.ConsoleApplication;

import java.io.Serializable;

public class SystemBilling implements Comparable<SystemBilling>,Serializable
{
	private String CustomerName;
	private long MobileNumber;
	private String CustomerAdvisor;
	private String Brand;
	private String Model;
	private int Quantity;
	private double Price;
	@Override
	public int compareTo(SystemBilling o) 
	{
		return this.CustomerName.compareTo(o.CustomerName);
	}
	public SystemBilling() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SystemBilling(String customerName, long mobileNumber, String customerAdvisor, String brand, String model,
			int quantity, double price) {
		super();
		CustomerName = customerName;
		MobileNumber = mobileNumber;
		CustomerAdvisor = customerAdvisor;
		Brand = brand;
		Model = model;
		Quantity = quantity;
		Price = price;
	}
	@Override
	public String toString() {
		return "SystemBilling [CustomerName=" + CustomerName + ", MobileNumber=" + MobileNumber + ", CustomerAdvisor="
				+ CustomerAdvisor + ", Brand=" + Brand + ", Model=" + Model + ", Quantity=" + Quantity + ", Price="
				+ Price + ", getCustomerName()=" + getCustomerName() + ", getMobileNumber()=" + getMobileNumber()
				+ ", getCustomerAdvisor()=" + getCustomerAdvisor() + ", getBrand()=" + getBrand() + ", getModel()="
				+ getModel() + ", getQuantity()=" + getQuantity() + ", getPrice()=" + getPrice() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public long getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		MobileNumber = mobileNumber;
	}
	public String getCustomerAdvisor() {
		return CustomerAdvisor;
	}
	public void setCustomerAdvisor(String customerAdvisor) {
		CustomerAdvisor = customerAdvisor;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}

}

