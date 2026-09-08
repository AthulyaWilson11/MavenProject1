package exceptionHandling;

public class CustomDemo2_Age {

	public void check(int age) throws AgeException  {
		if(age<18) {
			throw new AgeException("Applicat age should be 18 and above");
		}
		
	}
	public static void main(String[] args) {
		
		CustomDemo2_Age ob= new CustomDemo2_Age();
		try {
		ob.check(17);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
