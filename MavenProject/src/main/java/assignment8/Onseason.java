package assignment8;

import java.util.Scanner;

//calculate discount If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%

public class Onseason {
	double purchaseamount;
	double discount;
	public void discount() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount on onseason");
		purchaseamount=sc.nextDouble();
		discount=purchaseamount*(15./100);
		double finalamount=purchaseamount-discount;
		System.out.println("final coast:"+ finalamount);
		
	}

}
