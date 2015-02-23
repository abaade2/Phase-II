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

	protected static String productCode;
	protected static String productType;

	
	public Product(String productCode, String productType){
		Product.productCode = productCode;
		Product.productType = productType;
	}


	public  String getProductCode() {
		return productCode;
	}


	public  void setProductCode(String productCode) {
		Product.productCode = productCode;
	}


	public static String getProductType() {
		return productType;
	}


	public static void setProductType(String productType) {
		Product.productType = productType;
	}
	
	
	
}

