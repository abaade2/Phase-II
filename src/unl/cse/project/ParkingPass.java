package unl.cse.project;

public class ParkingPass extends Product{
	
	private double hourlyFee;
	private Venues venue;
	private int hours;
	private String date;
	
	
	
	
	//Constructor for parking-pass
		public ParkingPass(String productCode, String productType, Venues venue, double hourlyFee){
			super(productCode, productType);
			this.hourlyFee = hourlyFee;
			this.venue = venue;
		}
		
		public double getHourlyFee() {
			return hourlyFee;
		}

		public void setHourlyFee(double hourlyFee) {
			this.hourlyFee = hourlyFee;
		}
		@Override
		public void setHours(int hours){
			this.hours = hours;
		}
		@Override
		public void setDate(String date){
			this.date = date;
		}
		public int getHours(){
			return hours;
		}
		public String getDate(){
			return date;
		}
		
		@Override
		public double getSubtotal(){
			return this.hourlyFee * this.hours;
		}
		@Override
		public double getTax(){
			return this.getSubtotal() * 0.04;
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
			System.out.printf("%s %10s %s (%d/units @ $%f/hr for %d hours  $%15.2f $%5.2f $%4.2f\n"
					, this.productCode, "Parking Pass", this.date, this.itemQuantity, this.hourlyFee, this.hours, this.getSubtotal(), this.getTax(), this.getTotal());
			
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
