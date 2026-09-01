package abstraction;

public class AbstractionClassMain extends AbstractionClass {

	public  void set( String name, int age) {	//override abstract method
		System.out.println(name);
		System.out.println(age);
	}
public void check() {
	System.out.println("place name pala");
}
	
	public static void main(String[] args) {
		//object creation
		AbstractionClassMain ob=new AbstractionClassMain();
	ob.check();
	ob.set("christy", 20);
	ob.add();
	ob.max(20,10);

	}

}
