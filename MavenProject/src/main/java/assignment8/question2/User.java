package assignment8.question2;

import java.util.Scanner;

public class User extends Bank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin");
		int pin=sc.nextInt();
		User ob=new User();
		ob.setPin(pin);
	if	(ob.getPin()==true) {
		System.out.println("valid");
	}
	else {
		System.out.println("enter correct pin");
	}

	}

}
