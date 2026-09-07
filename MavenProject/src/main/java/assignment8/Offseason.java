package assignment8;

import java.util.Scanner;

public class Offseason extends Onseason {
	
	double purchaseamount;
	double discount;
	public void discount() {
		
		Scanner sc=new Scanner(System.in);
		super.discount();
	    System.out.println("enter total amount on onseason");
		purchaseamount=sc.nextDouble();
		discount=purchaseamount*(40./100);
		System.out.println("discounted money:"+discount);
		double finalamount= purchaseamount-discount;
		System.out.println("amount after discount"+ finalamount);
		
	}

	public static void main(String[] args) {
		
		Offseason ob=new Offseason();
		ob.discount();
	}

}
