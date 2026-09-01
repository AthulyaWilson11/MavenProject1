package Polymorphism;

public class Offseason{

//Offseason, set discount 15% 
	double totalbill;
	
	void seasonDiscount(double b) {
		this.totalbill=b;
		double discount=b*(15.0/100);
		System.out.println("OffSeason Discount on total price:"+ discount);
		
	}
		 
	 }
	


