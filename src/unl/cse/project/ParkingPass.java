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
		
		public double getSubTotalPP(){
			return this.hourlyFee * this.hours;
		}
			
}
