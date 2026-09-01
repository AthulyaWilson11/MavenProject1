package palindrome.String;

public class Palindrome_Malayalam extends Palindrome_Java {
	
	public void checkMalayalam() {
		StringBuffer orginal=new StringBuffer("Malayalam");
		StringBuffer sb=new StringBuffer(orginal);  //store orginal value
		sb.reverse();
		System.out.println("Before reverse:"+orginal);
		System.out.println("After reverse:"+sb);
		//convert stringbuffer to standard sting for check equal
		String x=orginal.toString();
		String y=sb.toString();
		// case ignore to check for palindrome
		if(x.equalsIgnoreCase(y)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

	public static void main(String[] args) {
		//create object
		Palindrome_Malayalam o=new Palindrome_Malayalam();
		o.checkJava();
		o.checkMalayalam();

	}

}
