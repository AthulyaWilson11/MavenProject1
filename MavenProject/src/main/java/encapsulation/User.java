package encapsulation;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		System.out.println("enter a 4 digit pin");
		
		Scanner sc=new Scanner(System.in);
		int pin1=sc.nextInt();
		
		Bank bo=new Bank();		//object
		bo.setPin(pin1);
		if(bo.validatePin()==true) {
			System.out.println("valid pin");
		}
		else{System.out.println("invalid pin");}

	}

}
