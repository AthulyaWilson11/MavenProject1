package public_access_specifier;

public class Acess_Sp_Class {
public void add(int a, int b) {
	System.out.println(a+b);
}
	public static void main(String[] args) {
		Acess_Sp_Class ob=new Acess_Sp_Class();
		ob.add(10, 20);
	} 

}
