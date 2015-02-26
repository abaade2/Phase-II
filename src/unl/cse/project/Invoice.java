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

	
	
	public void printSummary(){
		System.out.printf("%s %s %s %f %f %f %f\n", this.invoiceCode, this.customer.toString(), this.salesPerson, this.calculateSubtotal(), this.customer.getFee(), this.calculateTax(), this.calculateDiscount(), this.calculateFinal());
	}

	//calculates the total subtotal of all products on a specific invoice
	public double calculateSubtotal(){
		int i = 0;
		double subtotal = 0;
		for(i=0; i<product.length; i++){
			//if the product is a refreshment 
			if(product[i].getProductType().equals("SR")){
				for(int j = 0; j<product.length; j++){
					//if there is a gameticket or seasonpass purchased in the invoice the refreshment has a 5% discount
					if(product[j].getProductType().equals("TS") || product[j].getProductType().equals("TG")){
						subtotal += (product[i].getSubtotal() * .05) - product[i].getSubtotal();
					}
							
				}
			}
			else{
				subtotal += product[i].getSubtotal();
			}
		}
		return subtotal;
	}
	
	
	
	//calculates the discount for a specific invoice
	public double calculateDiscount(){
		double discount = 0;
		//if the customer is a member they pay no tax and have a 7% discount
		if(this.customer.getType().equals("M")){
			return (this.calculateSubtotal() * .07) + this.calculateTax();
		}
		//if the customer is an agent they pay tax and have a 12% discount
		if(this.customer.getType().equals("A")){
			return this.calculateSubtotal() * .12;
		}
		//if the customer is a nonmember they have no discount
		else{
			return 0;
		}
	}
	
	//calculates the total tax for a specific invoice
	public double calculateTax(){
		int i = 0;
		double tax = 0;
		for(i=0; i<product.length; i++){
			tax += product[i].getTax();
		}
		return tax;
	}
	
	//calculates the total (including sub-totals and taxes) for a specific invoice
	public double calculateTotal(){
		int i = 0;
		double total = 0;
		for(i=0; i<product.length; i++){
			total += product[i].getTotal();
		}
		return total;
	}
	
	//calculates the final total after the discount and additional fee have been added
	public double calculateFinal(){
		return (this.calculateTotal() - this.calculateDiscount()) + this.customer.getFee();
	}
	
	//calculates the savings of a customer (discount - additional fee)
	public double calculateSavings(){
		return this.calculateDiscount() - this.customer.getFee();
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
