package unl.cse.project;

public class SeasonPass extends Product{
	private String team;
	private String startDate;
	private String endDate;
	private double cost;
	
	
	//Constructor for season-passes
		public SeasonPass(String productCode, String productType, String team, String startDate, String endDate, double cost){
			super(productCode, productType);
			this.team = team;
			this.startDate = startDate;
			this.endDate = endDate;
			this.cost = cost;
		}
		
		@Override
		public double getSubtotal(){
			return this.cost * this.getItemQuantity();
		}
		@Override
		public double getTax(){
			return this.getSubtotal() * 0.06;
		}

		public String getTeam() {
			return team;
		}


		public void setTeam(String team) {
			this.team = team;
		}


		public String getStartDate() {
			return startDate;
		}


		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}


		public String getEndDate() {
			return endDate;
		}


		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}


		public double getCost() {
			return cost;
		}


		public void setCost(double cost) {
			this.cost = cost;
		}

		@Override
		public void printGameTicket() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void printSeasonPass() {
			System.out.printf("%s %10s- %s $%15.2f $%5.2f $%4.2f\n",
					this.productCode, "SeasonPass", this.team, this.getSubtotal(), this.getTax(), this.getTotal());
			System.out.printf("%10s%d units @ $%10f/unit prorated 100/150 days)", "(", this.itemQuantity, this.cost);	
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
			// TODO Auto-generated method stub
			
		}
		
		
		
		
}