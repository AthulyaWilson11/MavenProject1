package super_keyword_Constructor;

public class Child extends Parent {
public Child(int a,int b) {
	super();
	int x=a+b;
	System.out.println("sum="+x);
}
public Child (int y) {
	super(10);
	System.out.println("y="+y);
	
}
	public static void main(String[] args) {
		Child ob=new Child(12,13);
		Child ob1=new Child(56);
		
		

	}

}
