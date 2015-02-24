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




public class Product {

	protected String productCode;   
	protected String productType;
	private int itemQuantity;

	
	public Product(String productCode, String productType){
		this.productCode = productCode;
		this.productType = productType;
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


	public void setSeats(String[] seats) {
	}


	public void setHours(int hours) {
		// TODO Auto-generated method stub
		
	}



	public void setDate(String date) {
		// TODO Auto-generated method stub
		
	}


	


	
	
	
	
}
