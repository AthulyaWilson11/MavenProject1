package super_Key_Word_method;

public class Child extends Parent {

public void get() {
	String name="rose";
	System.out.println(name);
	super.parent();
}
	public static void main(String[] args) {
		Child ob=new Child();
		ob.get();
		//ob.parent();

	}

}
