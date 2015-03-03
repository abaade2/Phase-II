package unl.cse.project;
/*
 * Customer Class
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This class is the constructor for the customer object.
 */


public class Customer {
	private String customerCode;
	private String type;
	private Persons primaryContact;
	private String name;
	private Address address;
		
	public Customer(String customerCode, String type, Persons primaryContact, String name, Address address){
		
		this.customerCode = customerCode;
		this.type = type;
		this.primaryContact = primaryContact;
		this.name = name;
		this.address = address;
		
	}
	
	public double getDiscountPercentage() {
		double discount = 0;
	    if(this.type.equals("A")){
	    	discount = 12;
	        return discount;
	    }else if(this.type.equals("M")){
	    	discount = 7;
	        return discount;
	    }else{
	    return discount;
	    }
	 }
	
	public double getFee(){
		if(this.type.equals("M")){
			return 120.0;
		}else if(this.type.equals("A")){
			return 150.0;
		}else return 0.0;	
	}

	public void printCustomer(){
		System.out.println(this.name + "(" + this.customerCode + ")");
		System.out.println("[" + this.type +"]");
		System.out.println(this.primaryContact.getName());
		System.out.println(this.address.getStreet());
		System.out.println(this.address.getCity() + " " + this.address.getState() + " "+ this.address.getZipcode() + " "+ this.address.getCountry());
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
	
	public String getCustomerCode() {
		return customerCode;
	}

	public String getType() {
		return type;
	}

	public Persons getPrimaryContact() {
		return primaryContact;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

}
