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
		
		@Override
		public double getSubtotal(){
			return this.hourlyFee * this.hours;
		}
		@Override
		public double getTax(){
			return this.getItemQuantity() * this.getSubtotal() * 0.04 ;
		}

		@Override
		public void printParkingPass() {
			System.out.printf("%-10s %-10s %s (%d units @ $%.2f/hr for %d hours) %19s $%10.2f $%10.2f $%10.2f\n"
					, this.productCode, "Parking Pass", this.date, this.getItemQuantity(), this.hourlyFee, this.hours, "", this.getItemQuantity() *  this.getSubtotal(), this.getTax(), this.getTotal());

		}



		//Getters and Setters
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
		public void printPSL() {
		}

		@Override
		public void printRefreshments() {
		}
		@Override
		public void printGameTicket() {
		}
		@Override
		public void printSeasonPass() {
		}
			
}
