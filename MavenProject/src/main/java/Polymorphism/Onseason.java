package Polymorphism;

public class Onseason extends Offseason {
	// discount  on Onseason 40% 
	
	void seasonDiscount(double b) {
		
		double discount=b*(40.0/100);
		
		super.seasonDiscount(2000);
		
		System.out.println("OnSeason Discount on total price:"+ discount);
	}
	public static void main(String[] args) {
		Onseason ob=new Onseason();
		ob.seasonDiscount(3500);
		
	}
}
