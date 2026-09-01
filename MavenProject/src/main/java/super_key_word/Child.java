package super_key_word;

public class Child extends Parent{
	int a=20; 	// instance
	
	public Child() {	//constructor
		
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args) {
		Child o=new Child();

	}

}
