package assignment6.question2;

import java.util.Scanner;

//Class 1 Get basic pay, deduction and bonus from console.

public class Class1 {
	double basicpay;
	double bonus;
	double deduction;
	public void get() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter basic pay");
		 basicpay=sc.nextInt();
		
		System.out.println("enter deduction");
		 deduction=sc.nextInt();
		
		System.out.println("enter bonus");
		bonus=sc.nextInt();
	}

}
