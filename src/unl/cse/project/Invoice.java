package unl.cse.project;


public class Invoice {

	private String invoiceCode;
	private Customer customer;
	private Persons salesPerson;
	private String date;
	private Product[] product;
	
	
	public Invoice( String invoiceCode,
	 Customer customer,
	 Persons salesPerson,
     String date,
	Product[] product){
		this.setInvoiceCode(invoiceCode);
		this.setCustomer(customer);
		this.setSalesPerson(salesPerson);
		this.setDate(date);
		this.setProduct(product);
	}


	public Product[] getProduct() {
		return product;
	}


	public void setProduct(Product[] product) {
		this.product = product;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Persons getSalesPerson() {
		return salesPerson;
	}


	public void setSalesPerson(Persons salesPerson) {
		this.salesPerson = salesPerson;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public String getInvoiceCode() {
		return invoiceCode;
	}


	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

}