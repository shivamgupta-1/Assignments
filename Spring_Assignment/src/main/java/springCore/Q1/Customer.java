package springCore.Q1;

public class Customer {

	private int customerId;
	private String customerName;
	private double customerContact;
	private Address customerAddress;
	
	public Customer(int customerId, String customerName, double customerContact, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	public int getCustomerId() {
		return customerId;
	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
	public String getCustomerName() {
		return customerName;
	}
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
	public double getCustomerContact() {
		return customerContact;
	}
//	public void setCustomerContact(double customerContact) {
//		this.customerContact = customerContact;
//	}
	
	
	public Address getCustomerAddress() {
		return customerAddress;
	}
//	public void setCustomerAddress(Address customerAddress) {
//		this.customerAddress = customerAddress;
//	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}
	
	
}
