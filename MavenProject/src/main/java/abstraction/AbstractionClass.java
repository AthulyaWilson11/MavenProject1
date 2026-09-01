package abstraction;

public abstract class AbstractionClass {		// abstract class
	
	
public abstract void set( String name, int age);	//abstract method-hiding


public void add() {				//non abstract method
		int a=100;
		int c=103;
		System.out.println(a+c);
	}
public void max(int p,int q) {			//non abstract method
		if(p>q) {
			System.out.println("p is greater");
		}
	}
	

}
