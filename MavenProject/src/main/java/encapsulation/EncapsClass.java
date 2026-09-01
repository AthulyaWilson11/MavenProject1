package encapsulation;

public class EncapsClass {
	private int a;		//private variable  used for encapsulation
	private int b;
public void methodsetter(int a,int b) {			//setter
		this.a=a;
		this.b=b;	
	}
public void methodgetter() {		//getter
	System.out.println(a+b);
}

	public static void main(String[] args) {
		EncapsClass	eo=new EncapsClass();
		eo.methodsetter(10, 23);
		eo.methodgetter();

	}

}
