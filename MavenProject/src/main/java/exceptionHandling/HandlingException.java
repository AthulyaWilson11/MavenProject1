package exceptionHandling;

public class HandlingException {

	public static void main(String[] args) {
		try {
		int a=5;
		int div=a/0;
		System.out.println(div);
		
		}
		catch(Exception e) {		//exception is the parent class of all exception
			System.out.println(e);
		}
		
		finally {
			System.out.println("not divisible");  // finally will excete without catch also
		}
		
	}
	

}
