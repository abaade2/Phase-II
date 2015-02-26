package unl.cse.project;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;

//import com.thoughtworks.xstream.*;
/*
 * Main Program
 * CSCE 156
 * Assignment 2-6
 * Austin Baade
 * Carlos Sandoval
 * 
 * 
 * This Program reads in flat files, creates instances of objects, and then outputs them to XML files.
 */





public class InvoiceReport {
public static void main(String[] args) {		
		//New scanner that reads in the Persons data file
		String fileName = "data/Persons.dat";
		Scanner t = null;
		try {
			t = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Create a new Persons array--the size is the first line which has the number of records in the file
		
		Persons Persons[] = new Persons[t.nextInt()];
		t.nextLine();
		//Read in and process the data file, create persons and add them to the array
		//Reading in the customer file
		int i = 0;
		while(t.hasNext()){
			//Store the next line in a string
			String line = t.nextLine();
			//split the string with the delimiter ";" into a string array
			String[] tokens = line.split(";");
			//The string is now split along the delimiter
			String personCode = tokens[0];
			String[] personName = tokens[1].split(",");
			Name name = new Name(personName[1], personName[0]);
			//Split the address along the delimiter and create a new address object
			String[] address = tokens[2].split(",");
			Address personAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
			//*******************Error*************************************//
			//*****************There can be 0 e-mails, 1 or more*************//
			String[] email = null;
			if(tokens.length > 3){
				email = tokens[3].split(",");
			}
			Persons newPerson = new Persons(personCode, name, personAddress, email);
			Persons[i] = newPerson;
			i++;
		}		
		
		
/*		//Converting array to xml file
		File xmlOut2 = new File("data/Persons.xml");
		XStream xstream = new XStream();
		
		FileWriter writer2 = null;
		try { 
			writer2 = new FileWriter(xmlOut2); 
		} 
		catch (IOException e) { 
			e.printStackTrace();
		}
		//For loop that goes through the array of persons converting it to xml
		for(Persons p : Persons) { 
			String pOut = xstream.toXML(p);
			try {
				writer2.write(pOut+"\n");
			} catch (IOException e) {
				e.printStackTrace();;
			}
			
			} try {
				writer2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
			
		*/
		
		//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		//Create a scanner to read in the file
		fileName = "data/Customers.dat";
		Scanner s = null;
		
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//Create a new customer array---the size is the first line which has the number of records in the file
		Customer Customers[] = new Customer[s.nextInt()];
		s.nextLine();
		//Read in and process the data file, create customers and add them to the array
		//Reading in the customer file
		i = 0;
		while(s.hasNext()){
			//Store the next line in a string
			String line = s.nextLine();
			//split the string with the delimiter ";" into a string array
			String[] tokens = line.split(";");
			//The string is now split along the delimiter
			String customerCode = tokens[0];
			String type = tokens[1];
			String primaryContact = tokens[2];
			
			Persons person= null;
			int j = 0;
			while(j<Persons.length){
				if(Persons[j].getPersonCode().contains(primaryContact)){
					person = Persons[j];
				}
				j++;
			}
			String name = tokens[3];
			//Split the address along the delimiter and create a new address object
			String[] address = tokens[4].split(",");
			Address customerAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
			Customer newCustomer = new Customer(customerCode, type, person, name, customerAddress);
			Customers[i] = newCustomer;
			i++;
		}
		
	/*	
		//Converting array to xml file
		File xmlOut = new File("data/Customers.xml");
		FileWriter writer = null;
		
		try { 
			writer = new FileWriter(xmlOut); 
		} 
		catch (IOException e) { 
			e.printStackTrace();
		}
		//For loop that goes through the array of customers converting it to xml
		for(Customer cs : Customers) { 
			String csout = xstream.toXML(cs);
			try {
				writer.write(csout+"\n");
			} catch (IOException e) {
				e.printStackTrace();;
			}
	
			} try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		*/	
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

			//Create a scanner to read in the file
			fileName = "data/Venues.dat";
			Scanner q = null;
			
			try {
				q = new Scanner(new File(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			//Create a new customer array---the size is the first line which has the number of records in the file
			Venues Venues[] = new Venues[q.nextInt()];
			q.nextLine();
			//Read in and process the data file, create customers and add them to the array
			//Reading in the customer file
			i = 0;
			while(q.hasNext()){
				//Store the next line in a string
				String line = q.nextLine();
				//split the string with the delimiter ";" into a string array
				String[] tokens = line.split(";");
				//The string is now split along the delimiter
				String venueCode = tokens[0];
				String name = tokens[1];
				//Split the address along the delimiter and create a new address object
				String[] address = tokens[2].split(",");
				Address venueAddress = new Address(address[0], address[1], address[2], address[3], address[4]);
				String capacity = tokens[3];
				Venues newVenue = new Venues(venueCode, name, venueAddress, capacity);
				Venues[i] = newVenue;
				i++;
			}
			
		/*	
			//Converting array to xml file
			File xmlOut4 = new File("data/Venues.xml");
			FileWriter writer4 = null;
			
			try { 
				writer4 = new FileWriter(xmlOut4); 
			} 
			catch (IOException e) { 
				e.printStackTrace();
			}
			//For loop that goes through the array of customers converting it to xml
			for(Venues vs : Venues) { 
				String vsout = xstream.toXML(vs);
				try {
					writer4.write(vsout+"\n");
				} catch (IOException e) {
					e.printStackTrace();;
				}
		
				} try {
					writer4.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		
		
	
		*/
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			//New scanner that reads in the Product data file
			fileName = "data/Products.dat";
			Scanner p = null;
			try {
				p = new Scanner(new File(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			//Create a new Product array--the size is the first line which has the number of records in the file
			Product ProductArray[] = new Product[p.nextInt()];
			p.nextLine();
			//Read in and process the data file, create product object and add them to the array
			//Reading in the customer file
			i = 0;
			while(p.hasNext()){
				//Store the next line in a string
				String line = p.nextLine();
				//split the string with the delimiter ";" into a string array
				String[] tokens = line.split(";");
				//The string is now split along the delimiter
				String productCode = tokens[0];
				String productType = tokens[1];
				if(productType.equals("TG")){//game ticket
					String venueCode = tokens[2];	
					Venues venue2 = null;	
					int j = 0;
					while(j<Venues.length){
						if(Venues[j].getVenueCode().contains(venueCode)){
							venue2 =Venues[j];
						}
						j++;
					}	
					String dateTime = tokens[3];
					String team1 = tokens[4];
					String team2 = tokens[5];
					double pricePerUnit = Double.parseDouble(tokens[6]);
					
					if(venue2 != null){
						Product newProduct = new GameTicket(productCode, productType, venue2, dateTime, team1, team2, pricePerUnit);
						ProductArray[i] = newProduct;
					}else{
						Product newProduct = new GameTicket(productCode, productType, null, dateTime, team1, team2, pricePerUnit);
						ProductArray[i] = newProduct;
					}
				}
				else if(productType.equals("TS")){//season pass
					String team = tokens[2];
					String startDate = tokens[3];
					String endDate = tokens[4];
					double cost = Double.parseDouble(tokens[5]);
					Product newProduct = new SeasonPass(productCode, productType, team, startDate, endDate, cost);
					ProductArray[i] = newProduct;

				}
				else if(productType.equals("SP")){//parking pass
					String venueCode = tokens[2];
					Venues venue2= null;
					int j = 0;
					while(j<Venues.length){
						if(Venues[j].getVenueCode().contains(venueCode)){
							venue2 = Venues[j];
						}
						j++;
					}			
					double hourlyFee = Double.parseDouble(tokens[3]);
					Product newProduct = new ParkingPass(productCode, productType, venue2, hourlyFee);
					ProductArray[i] = newProduct;			
				}
				else if(productType.equals("SL")){//psl
					String ticketCode = tokens[2];
					double licenseFee = Double.parseDouble(tokens[3]);
					GameTicket ticket= null;
					SeasonPass pass = null;
					///////////////////////////////////////
					//new scanner to specifically look for the ticket the GameTicket or seasonpass that the PSL is referring to
					Scanner ww = null;
					try {
						ww = new Scanner(new File(fileName));
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} 
					String productCodeArray[] = new String[ww.nextInt()];
					ww.nextLine();
					while(ww.hasNext()){
						String aLine = ww.nextLine();
						//split the string with the delimiter ";" into a string array
						String[] tokens83 = aLine.split(";");
						//The string is now split along the delimiter
						String gameTicketCode = tokens83[0];	
						if(ticketCode.equals(gameTicketCode)){
							String productType1 = tokens83[1];
							//if the psl is referring to a gameticket
							if(productType1.equals("TG")){
								String venueCode = tokens83[2];	
								Venues venue2 = null;	
								int j = 0;
								while(j<Venues.length){
									if(Venues[j].getVenueCode().contains(venueCode)){
										venue2 =Venues[j];
									}
									j++;
								}	
								String dateTime = tokens83[3];
								String team1 = tokens83[4];
								String team2 = tokens83[5];
								double pricePerUnit = Double.parseDouble(tokens83[6]);
								
								if(venue2 != null){
									ticket = new GameTicket(gameTicketCode, productType1, venue2, dateTime, team1, team2, pricePerUnit);
								}else{
									ticket = new GameTicket(gameTicketCode, productType1, null, dateTime, team1, team2, pricePerUnit);
								}
							}
							else{
								String team = tokens83[2];	
								String startDate = tokens83[3];
								String endDate = tokens83[4];
								double cost = Double.parseDouble(tokens83[5]);
								pass = new SeasonPass(gameTicketCode, productType1, team, startDate, endDate, cost);
							}
						}
					}
					Product newProduct = null;
					
					if(ticket != null){
						newProduct = new PSL(productCode, productType, licenseFee, ticket, null);
					}else{
						newProduct = new PSL(productCode, productType, licenseFee, null, pass);
					}
					ProductArray[i] = newProduct;
				
				}
				else if(productType.equals("SR")){//refreshment
					String name = tokens[2];
					double cost = Double.parseDouble(tokens[3]);
					Product newProduct = new Refreshments(productCode, productType, name, cost);
					ProductArray[i] = newProduct;
				}
				i++;
			}		
			
		/*	//Converting array to xml file
			File xmlOut3 = new File("data/Products.xml");
			FileWriter writer3 = null;
			
			try { 
				writer3 = new FileWriter(xmlOut3); 
			} 
			catch (IOException e) { 
				e.printStackTrace();
			}
			//For loop that goes through the array of persons converting it to xml
			for(Product product1 : ProductArray) { 
				String productOut = xstream.toXML(product1);
				try {
					writer3.write(productOut+"\n");
				} catch (IOException e) {
					e.printStackTrace();;
				}
				
				} try {
					writer3.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
		*/
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
			//New scanner that reads in the Product data file
			fileName = "data/Invoices.dat";
			Scanner z = null;
			try {
				z = new Scanner(new File(fileName));
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			//Create a new Product array--the size is the first line which has the number of records in the file
			Invoice InvoiceArray[] = new Invoice[z.nextInt()];
			z.nextLine();
			//Read in and process the data file, create product object and add them to the array
			//Reading in the customer file
			i = 0;
			while(z.hasNext()){
				//Store the next line in a string
				String line = z.nextLine();
				//split the string with the delimiter ";" into a string array
				String[] tokens = line.split(";");
				//The string is now split along the delimiter
				String invoiceCode = tokens[0];
				String customerCode = tokens[1];
				Customer customer= null;
				int j = 0;
				while(j<Customers.length){
					if(Customers[j].getCustomerCode().contains(customerCode)){
						customer = Customers[j];
					}
					j++;
				}
				String salesPersonCode = tokens[2];
				Persons person= null;
				int h = 0;
				while(h<Persons.length){
					if(Persons[j].getPersonCode().contains(salesPersonCode)){
						person = Persons[j];
					}
					h++;
				}
				String date = tokens[3];
				String Products = tokens[4];
				String[] splitProducts = tokens[4].split(","); //the whole token of products split into individual products
				String[] individualProducts = null;
				Product[] invoiceProducts = null;//variable to hold the array of products
				String[] seats = null;
				int y = 0;
				int counter = 0;
				for(int e = 0; e<splitProducts.length; e++){ //goes through each product and splits it 
					individualProducts = splitProducts[e].split(":");//splits the individual product into its separate parts
					while(y<individualProducts.length){ //goes through the individual product
						for(int l = 0;l<ProductArray.length;l++){//goes through the already parsed product array
							if(ProductArray[l].getProductCode().contains(individualProducts[e])){//if the product codes match
								if(ProductArray[l].getProductType().equals("TS")){//season pass
									invoiceProducts[e] = ProductArray[l];
									invoiceProducts[e].setItemQuantity(Integer.parseInt(invoiceProducts[e+1].toString()));
								}else if(ProductArray[y].getProductType().equals("SR")){//refreshment
									invoiceProducts[e] = ProductArray[l];
									invoiceProducts[e].setItemQuantity(Integer.parseInt(invoiceProducts[e+1].toString()));
								}else if(ProductArray[y].getProductType().equals("SL")){//psl
									invoiceProducts[e] = ProductArray[l];
									invoiceProducts[e].setItemQuantity(Integer.parseInt(invoiceProducts[e+1].toString()));
									for(int v = 2; v<individualProducts.length; v++){
										seats[counter] = invoiceProducts[v].toString();
										counter++;
									}
									invoiceProducts[e].setSeats(seats);
								}else if(ProductArray[y].getProductType().equals("TG")){//gameticket
									invoiceProducts[e] = ProductArray[y];
									invoiceProducts[e].setItemQuantity(Integer.parseInt(invoiceProducts[e+1].toString()));
								}else if(ProductArray[y].getProductType().equals("SP")){//parking pass
									invoiceProducts[e] = ProductArray[y];
									invoiceProducts[e].setItemQuantity(Integer.parseInt(invoiceProducts[e+2].toString()));
									invoiceProducts[e].setDate(invoiceProducts[e+1].toString());
									invoiceProducts[e].setHours(Integer.parseInt(invoiceProducts[e+3].toString()));	
								}
								
							}
							y++;
						}
					
					
					}
					InvoiceArray[i] = new Invoice(invoiceCode, customer, person, date, invoiceProducts);
					i++;
				}
		}	
		
			
		System.out.println("Executive Summary Report:");
		System.out.println("===========================================================");
		System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s\n", "Invoice", "Customer", "Salesperson", "Subtotal", "Fees", "Taxes", "Discount", "Total");
		for(int o =0; o<InvoiceArray.length; o++){
			InvoiceArray[o].printSummary();
		}
		System.out.println("===========================================================");
		double subtotal=0, fees=0, taxes=0, discount=0, total=0;
		for(int o=0; o<InvoiceArray.length; o++){
			subtotal += InvoiceArray[o].calculateSubtotal();
			fees += InvoiceArray[o].getCustomer().getFee();
			taxes += InvoiceArray[o].calculateTax();
			discount += InvoiceArray[o].calculateDiscount();
			total += InvoiceArray[o].calculateFinal();
		}
		System.out.printf("%s %10f %10f %10f %10f %10f\n", "TOTALS", subtotal, fees, taxes, discount, total);

		
		System.out.println("Individual Invoice Detail Reports:");
		System.out.println("===========================================================");
		for(int v = 0; v<InvoiceArray.length; v++){
			System.out.println("Invoice " + InvoiceArray[v].getInvoiceCode());
			System.out.println("===========================================================");
			System.out.println("Salesperson:" + InvoiceArray[v].getSalesPerson());
			System.out.println("Customer Info");
			InvoiceArray[v].getCustomer().printCustomer();
			System.out.println("-------------------------------------------------------");
			System.out.printf("%s %10s %80s %10s %10s\n", "Code", "Item", "Tax", "Total");
			if(InvoiceArray[v].getProduct()[v].getProductType().equals("TG")){
				InvoiceArray[v].getProduct()[v].printGameTicket();
			}
			if(InvoiceArray[v].getProduct().equals("SP")){
				InvoiceArray[v].getProduct()[v].printParkingPass();
			}
			if(InvoiceArray[v].getProduct().equals("SL")){
				InvoiceArray[v].getProduct()[v].printPSL();	
			}
			if(InvoiceArray[v].getProduct().equals("TS")){
				InvoiceArray[v].getProduct()[v].printSeasonPass();
			}
			if(InvoiceArray[v].getProduct().equals("SR")){
				InvoiceArray[v].getProduct()[v].printSeasonPass();
			}
			System.out.println("											===========================================================");
			System.out.printf("SUBTOTALS: %50f %10f %10f\n", InvoiceArray[v].calculateSubtotal(), InvoiceArray[v].calculateTax(), InvoiceArray[v].calculateTotal());
			System.out.printf("DISCOUNT ( %d% ) $-%60s\n", InvoiceArray[v].getCustomer().getDiscountPercentage(),InvoiceArray[v].calculateDiscount());
			System.out.printf("ADDITIONAL FEE ( %d ) $%60s\n", InvoiceArray[v].getCustomer().getFee());
			System.out.printf("TOTAL $%60s\n", InvoiceArray[v].calculateFinal());
			if(InvoiceArray[v].calculateSavings() > 0){
				System.out.printf("				You saved $%.2f\n", InvoiceArray[v].calculateSavings());
			}
			else{
				System.out.println("Thank you for your purchase!");
			}
			
		}
		
		System.out.println("=========================================================================================================");
		
		
		
		
		
		
		
		
		
		
		
	
				
				
	}
}
