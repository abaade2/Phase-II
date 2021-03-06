package unl.cse.project;
public class Refreshments extends Product{
	
	private double cost;
	private String name;
	//Constructor for Refreshments
		public Refreshments(String productCode, String productType, String name, double cost){
			super(productCode, productType);
			this.name = name;
			this.cost = cost;
		}
		@Override
		public double getSubtotal(){
			return this.cost;
		}
		@Override
		public double getTax(){
			return this.getItemQuantity() * this.getSubtotal() * 0.04 ;
		}
		@Override
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getName() {
			return name;
		}

		@Override
		public void printGameTicket() {
			// TODO Auto-generated method stub

		}
		@Override
		public void printSeasonPass() {
			// TODO Auto-generated method stub

		}
		@Override
		public void printParkingPass() {
			// TODO Auto-generated method stub

		}
		@Override
		public void printPSL() {
			// TODO Auto-generated method stub

		}
		@Override
		public void printRefreshments() {
			System.out.printf("%-10s %-10s (%d units @ $%.2f/unit) %40s%10.2f $%10.2f $%10.2f\n",
					this.productCode, this.name, this.itemQuantity, this.cost, "$", this.getSubtotal() * this.getItemQuantity(), this.getTax(), this.getTotal());

		}
		
}
