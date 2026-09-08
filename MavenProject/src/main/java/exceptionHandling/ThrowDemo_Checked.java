package exceptionHandling;

public class ThrowDemo_Checked {
	
	public void checkage(int age) throws IllegalAccessException   {
		if(age<18) {
			throw new IllegalAccessException("access denied- age must be 18 or more");			//checked exception				
		}
		System.out.println("access allowed");
	}

	public static void main(String[] args)  {
	
		ThrowDemo_Checked ob=new ThrowDemo_Checked();
		try {
		ob.checkage(13);
		}
		catch(IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
