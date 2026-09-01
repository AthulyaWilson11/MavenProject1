package Polymorphism;

public class ChildClass	extends ParentClass {
	public void class1(int a,int b) {	//method overriding
		super.class1(10, 8);			//to get parent class details call parent using super key
		System.out.println(a*b);		
	}
	public static void main(String[] args) {
		ChildClass oc= new ChildClass();
		oc.class1(10, 8);
		
		/*
		    upcasting	 call child class
		 
		ParentClass pc=new ChildClass();
		pc.class1(10,5);
		
		*/
	}

}
