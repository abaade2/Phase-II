package unl.cse.project;

public class GameTicket extends Product{
	private String dateTime;
	private String team1;
	private String team2;
	private double pricePerUnit;
	private Venues venue;
	
	
	//Constructor for Game Ticket
	public GameTicket(String productCode, String productType, Venues venue, String dateTime, String team1, String team2, double pricePerUnit){
		super(productCode, productType);
		this.dateTime = dateTime;
		this.team1 = team1;
		this.team2 = team2;
		this.pricePerUnit = pricePerUnit;
		this.venue = venue;
	}
	@Override
	public void printGameTicket(){
		System.out.printf("%s %10s %s %s vs %s $%15.2f $%5.2f $%4.2f\n",
				this.productCode, "GameTicket", this.dateTime, this.team1, this.team2, this.getSubtotal(), this.getTax(), this.getTotal());
		System.out.printf("%10s%d units @ $%10f/unit)", "(", this.itemQuantity, this.pricePerUnit);
		
	}
	
	@Override
	public double getTax(){
		return this.getSubtotal() * 0.06;
	}
	@Override
	public double getSubtotal(){
		return this.pricePerUnit * this.getItemQuantity();
	}
	
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getTeam1() {
		return team1;
	}
	public String getTeam2() {
		return team2;
	}
	public double getPricePerUnit() {
		return pricePerUnit;
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
		// TODO Auto-generated method stub
		
	}
	
}
