package unl.cse.project;

import org.joda.time.DateTime;
import org.joda.time.Days;

public class Invoice {

private String invoiceCode;
	private Customer customer;
	private Persons salesPerson;
	private DateTime date;
	private Product[] product;
	
	
	public Invoice( String invoiceCode,
	 Customer customer,
	 Persons salesPerson,
	 DateTime date,
	Product[] product){
		this.invoiceCode = invoiceCode;
		this.customer = customer;
		this.salesPerson = salesPerson;
		this.date = date;
		this.product = product;
	}
	
	@Override
	public String toString(){
		return this.invoiceCode;
	}
	public void printSummary(){
		System.out.printf("%-10s %-20s %-20s $%10.2f $%6.2f $%10.2f $%10.2f $%10.2f\n", this.invoiceCode, this.customer.toString(), this.salesPerson.toString(), this.calculateSubtotal(), this.customer.getFee(), this.calculateTax(), this.calculateDiscount(), this.calculateFinal());
	}

	//calculates the total subtotal of all products on a specific invoice
	public double calculateSubtotal(){
		int i = 0;
		double subtotal = 0;
		//int check = 0;
		for(Product prod: this.product){
			//if the product is a refreshment
			if(prod.getProductType().equals("SR")){
				//check = 0;
				//if the product is a refreshment, the item quantity is messed up when there are multiple invoices with the same refreshment at a different quantity
				//while(check == 0){ //to end the for loop if the search finds a gameticket or seasopass(prevents readding the price of the refreshment)
					for(Product pro: this.product){
						//if there is a gameticket or seasonpass purchased in the invoice the refreshment has a 5% discount
						if(pro.getProductType().equals("TS") || pro.getProductType().equals("TG")){
							subtotal += (prod.getSubtotal() - (prod.getSubtotal() * 0.05)) * prod.getItemQuantity();
							check++;
						}			
					}
				//}
				//if(check ==0){
					//subtotal += prod.getSubtotal();
				//}
			}
			if(prod.getProductType().equals("TS")){
				double daysLeft = Days.daysBetween(this.date, prod.getEndDate()).getDays();
				double costPerDay = prod.getSubtotal() / prod.calculateTotalDays();
				//fixed rate prorated to the days left
				double cost = costPerDay * daysLeft;
				double unutilizedTime = prod.calculateTotalDays() - daysLeft;
				//unutilized time * cost per day * 30%
				double extraCost = unutilizedTime * costPerDay * .3;
				//add extracost and cost
				double sum = cost + extraCost;
				//multiply by the item quantity
				subtotal += sum * prod.getItemQuantity();
			}
			else{
				subtotal += prod.getSubtotal();
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
			return discount;
		}
	}
	
	//calculates the total tax for a specific invoice
	public double calculateTax(){
		int i = 0;
		double tax = 0;
		for(i=0; i<this.product.length; i++){
			tax += this.getProduct()[i].getTax();
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


	public DateTime getDate() {
		return date;
	}


	public void setDate(DateTime date) {
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