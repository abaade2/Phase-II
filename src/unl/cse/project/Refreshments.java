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
			return this.getSubtotal() * 0.04;
		}
		public double getCost() {
			return cost;
		}
		public void setCost(double cost) {
			this.cost = cost;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
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
			System.out.printf("%s %10s (%d units @ $%.2f/unit) $%15.2f $%5.2f $%4.2f\n",
					this.productCode, this.name, this.itemQuantity, this.cost, this.getSubtotal(), this.getTax(), this.getTotal());
			
		}
		
}
