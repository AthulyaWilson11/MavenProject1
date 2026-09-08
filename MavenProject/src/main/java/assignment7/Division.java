package assignment7;
// Class 2 Check the addition result is divisible by 10(use super keyword)
public class Division extends Addition{
	
	public void divi() {
	int z=	super.add(5,15);
	
	
	 if(z%10==0) {
		System.out.println("divisible by 10");
	}
	 else {System.out.println("not divisible by 10");}	
	}

	public static void main(String[] args) {
		Division ob=new Division();
		
ob.divi();

	}

}
