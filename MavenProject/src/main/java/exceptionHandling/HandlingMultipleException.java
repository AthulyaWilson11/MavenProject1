package exceptionHandling;

public class HandlingMultipleException {

	public static void main(String[] args) {
		try {
			int a[]= new int [5]; // decla and initialize
			a[8]=100/0;				
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException a) {
			System.out.println(a);
		}

	}

}
