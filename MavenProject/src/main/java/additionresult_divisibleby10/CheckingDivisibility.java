package additionresult_divisibleby10;

public class CheckingDivisibility extends Addition {
//Check the addition result is divisible by 10(use super keyword) 
	
	public void check() {
	int x=	super.add(10,20);
		if(x%10==0) {
			System.out.println("divisible by 10");
		}
		else {System.out.println("not divisible by 10");}
	}
	public static void main(String[] args) {
		CheckingDivisibility ob=new CheckingDivisibility();
		ob.check();

	}

}
