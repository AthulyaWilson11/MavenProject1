package assignment6;
	//check whether the given Strings are Palindrome or not. • Java • Malayalam

public class PalindromeString {
	String j="Java";  
	String rev="";
	
	
	public void checkingjava() {
		System.out.println("String before reverse: "+j);
	
		for(int i=j.length()-1;i>=0;i--) {
		char store=j.charAt(i);
		rev=rev+store;		
	}
		
	System.out.println("reverse value: "+rev);
		if(j.equals(rev)) {
			System.out.println("palindrome");
		}
		else {System.out.println("not a palindrome");
		}	
	}
	
	public void checkingmalayalam() {
		String m="Malayalam";
		String re="";
		System.out.println("String before reverse: "+m);
		
		for(int i=m.length()-1;i>=0;i--) {
			char st=m.charAt(i);
			re=re+st;
		}
		System.out.println(re);
		if(m.toLowerCase(). equals(re.toLowerCase())) {
			System.out.println("palindrome");
			
		}
		else {System.out.println("not a palindrome");
		}
	}
	

	public static void main(String[] args) {
		
		PalindromeString ob=new PalindromeString();
		ob.checkingjava();
		ob.checkingmalayalam();

	}

}
