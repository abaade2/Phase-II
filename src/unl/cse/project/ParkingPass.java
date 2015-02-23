package unl.cse.project;

public class ParkingPass extends Product{
	
	private double hourlyFee;
	private Venues venue;
	
	
	
	
	//Constructor for parking-pass
		public ParkingPass(String productCode, String productType, Venues venue, double hourlyFee){
			super(productCode, productType);
			this.hourlyFee = hourlyFee;
			this.setVenue(venue);
		}
		public double getHourlyFee() {
			return hourlyFee;
		}

		public void setHourlyFee(double hourlyFee) {
			this.hourlyFee = hourlyFee;
		}
		public Venues getVenue() {
			return venue;
		}
		public void setVenue(Venues venue) {
			this.venue = venue;
		}


		
}
