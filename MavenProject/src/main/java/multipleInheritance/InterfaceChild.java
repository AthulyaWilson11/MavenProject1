package multipleInheritance;

public class InterfaceChild implements InterfaceParent1, InterfaceParent2{
	public void max(int a, int b) {
		System.out.println(a+b);
					}
public void name(String n) {
	System.out.println(n);
	}
public void place(String p) {
	System.out.println(p);
}
public void add(int x) {
	System.out.println(x);
}

	public static void main(String[] args) {
		InterfaceChild ob=new InterfaceChild();
		ob.add(12);
		ob.max(12, 13);
		ob.name("anu");
		ob.place("pala");

	}
}
