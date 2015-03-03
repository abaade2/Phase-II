package unl.cse.project;
import org.joda.time.DateTime;
import org.joda.time.Days;

public class SeasonPass extends Product{
	private String team;
	private DateTime startDate;
	private DateTime endDate;
	private double cost;
	
	
	//Constructor for season-passes
		public SeasonPass(String productCode, String productType, String team, DateTime startDate, DateTime endDate, double cost){
			super(productCode, productType);
			this.team = team;
			this.startDate = startDate;
			this.endDate = endDate;
			this.cost = cost;
		}
		
		@Override
		public double calculateTotalDays(){
			return Days.daysBetween(startDate, endDate).getDays();		
		}
		
		@Override
		public double getSubtotal(){
			return this.cost;
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


		public DateTime getStartDate() {
			return startDate;
		}


		public void setStartDate(DateTime startDate) {
			this.startDate = startDate;
		}

		@Override
		public DateTime getEndDate() {
			return endDate;
		}


		public void setEndDate(DateTime endDate) {
			this.endDate = endDate;
		}

		@Override
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
			System.out.printf("%-10s %-78s $%10.2f $%10.2f $%10.2f\n",
					this.productCode, "SeasonPass - "+ this.team, this.getSubtotal(), this.getTax(), this.getTotal());	
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
