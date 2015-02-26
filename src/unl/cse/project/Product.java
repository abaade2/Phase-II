package unl.cse.project;

/*
 * Product Class
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This class is the constructor for the product object.
 */




public abstract class Product {

	protected String productCode;   
	protected String productType;
	protected int itemQuantity;

	
	public Product(String productCode, String productType){
		this.productCode = productCode;
		this.productType = productType;
	}
	
	
	
	@Override
	public String toString(){
		return this.productCode +" "+ this.productType + " " +this.itemQuantity;
	}


	public String getProductCode() {
		return productCode;
	}


	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}


	public String getProductType() {
		return productType;
	}


	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity){
		this.itemQuantity = itemQuantity;
	}


	public abstract double getSubtotal();
	public abstract double getTax();


	public double getTotal() {
		return this.getSubtotal() - this.getTax();
	}

	public void setDate(String date) {} //method to keep the date of the parking pass
	public void setHours(int hours){} //method to keep the hours of the parking pass
	public void setSeats(String[] seats){} //method to keep the seasts for the PSL	
	
	
	public abstract void printGameTicket();
	public abstract void printSeasonPass();
	public abstract void printParkingPass();
	public abstract void printPSL();
	public abstract void printRefreshments();
	
}
