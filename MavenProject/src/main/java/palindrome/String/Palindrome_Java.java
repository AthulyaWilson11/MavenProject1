package palindrome.String;

public class Palindrome_Java {
	
	public void checkJava() {
		StringBuffer orginal=new StringBuffer("Java");
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
		//to get space 
		System.out.println();
	}

}
