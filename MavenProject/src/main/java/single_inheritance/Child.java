package single_inheritance;

//import public_access_specifier.Acess_Sp_Class;

public class Child extends Parent{
	public void demo(String name,int age) {  // child method
		System.out.println(name);
		System.out.println(age);
		
	}

	public static void main(String[] args) {	//main method
		
		Child o=new Child();	//object using child
		
		o.method(10,12);	//parent
		o.demo("anu", 12);
		/*
		Acess_Sp_Class ob=new Acess_Sp_Class(); // access  public access specifier
		ob.add(10, 20);
		*/
	}

}
