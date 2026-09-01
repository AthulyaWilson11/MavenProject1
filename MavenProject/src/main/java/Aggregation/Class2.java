package Aggregation;

public class Class2 {
	int x;
	int y;
	Class1 c1; //aggregation	c1 reference variable
public Class2(int x, int y,Class1 c1) {		//const
	this.x=x;
	this.y=y;
	this.c1=c1;
}
public void get() {				//method
	System.out.println(x);
	System.out.println(y);
	System.out.println(c1.a);
	System.out.println(c1.b);
}	

	public static void main(String[] args) {
		//call first class 
Class1 ob=new Class1(6,3);
//call second class
Class2 oc2=new Class2(2,4,ob);
//method call
oc2.get();


	}

}
