package exceptionHandling;

public class ThrowClass {

	public static void main(String[] args) {
		int age=15;
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			throw new ArithmeticException("not eligible due to age under 18");
		}

	}

}
