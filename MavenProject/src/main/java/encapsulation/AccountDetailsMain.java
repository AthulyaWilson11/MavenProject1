package encapsulation;

import java.util.Scanner;

public class AccountDetailsMain {

	public static void main(String[] args) {
		
		AccountDetails ob=new AccountDetails();	//objet
		
		ob.setacc(12345);
		System.out.println(ob.getacc());
		
		ob.setname("Rose mary");
		System.out.println(ob.getname());
		
		ob.setAmount(1200);
		System.out.println(ob.getAmount());

		Scanner sc=new Scanner(System.in);		// console input
		
		System.out.println("enter pin");
		ob.setpin(sc.nextInt());
		if(ob.validatepin()==true) {
			System.out.println("Valid Pin");
		}
		else {System.out.println("Invalid Pin Try Again");}
	}

}
