package abstraction;

public class AbstractInterface_child implements AbstractionInterface_Parent {
	public  void add1(int a) {
		System.out.println(a);
	}
	public  void add2(int x,int y) {
		System.out.println(x+y);
	}
	public  void add3(String n, String e) {
		System.out.println(n+""+e);
	}
	public void place() {
		System.out.println("neeloor");
	}
	public static void main(String[] args) {
		AbstractInterface_child ob=new AbstractInterface_child();
		ob.place();
		ob.add1(10);
		ob.add2(12, 13);
		ob.add3("rose", "mary");

	}

}
