package unl.cse.project;


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
	
	public double getFee(){
		if(this.type == "M"){
			return 120;
		}else if(this.type == "A"){
			return 150;
		}else return 0;
			
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
