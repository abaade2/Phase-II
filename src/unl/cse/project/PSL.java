package unl.cse.project;

public class PSL extends Product{
	//Constructor for PSL
	
	double licenseFee;
	private GameTicket ticket;
	private String[] seats;
	private SeasonPass pass;
	
		public PSL(String productCode, String productType, double licenseFee, GameTicket ticket, SeasonPass pass){
			super(productCode, productType);
			this.ticket = ticket;
			this.licenseFee = licenseFee;
			this.pass = pass;
		}

		@Override
		public double getTax(){
			return this.getSubtotal() * 0.04;
		}
		@Override
		public double getSubtotal(){
			//item quantity of PSL * (price of 1 game ticket * .18) 
			//plus cost of license(licensefee)
			return (this.getItemQuantity() * (this.ticket.getPricePerUnit() * .18)) + this.licenseFee;
		
		}
		
		
		@Override
		public void setSeats(String[] seats) {
			this.seats = seats;
		}
		public String[] getSeats() {
			return seats;
		}
		public double getLicenseFee() {
			return licenseFee;
		}
		public GameTicket getTicket(){
			return ticket;
		}
		public SeasonPass getPass(){
			return pass;
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
		
		public String seatToString(String[] seats){
			StringBuffer result = new StringBuffer();
			for (int i = 0; i < seats.length; i++) {
				   result.append( seats[i] );
				   if(i+1<seats.length){
					   result.append(":"); 
				   }
			}
			String newstring = result.toString();
			return newstring;			
		}
		
		

		@Override
		public void printPSL() {
			System.out.printf("%s %10s [%s](%d units @ 18%% of %s with $%.2f fee) $%15.2f $%5.2f $%4.2f\n",
					this.productCode, "PSL", seatToString(this.seats), this.itemQuantity , this.ticket.getProductCode(), this.licenseFee, this.getSubtotal(), this.getTax(), this.getTotal());
		}

		@Override
		public void printRefreshments() {
			// TODO Auto-generated method stub
			
		}

		
}
