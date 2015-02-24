package unl.cse.project;


public class PSL extends Product{
	//Constructor for PSL
	

	private String ticketCode;
	private double licenseFee;
	private String ticket;
	private String[] seats;
	
		public PSL(String productCode, String productType, double licenseFee, String ticket){
			super(productCode, productType);
			this.ticket = ticket;
			this.licenseFee = licenseFee;
		}

		public String[] getSeats() {
			return seats;
		}

		@Override
		public void setSeats(String[] seats) {
			this.seats = seats;
		}

		public String getTicketCode() {
			return ticketCode;
		}

		public double getLicenseFee() {
			return licenseFee;
		}

		
}
