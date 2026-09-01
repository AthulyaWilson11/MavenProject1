package hierarchical_inheritance;

public class Son extends Father{

	public void sname() {
		String name="alan";
		System.out.println(name);
	}
	
	public static void main(String[] args) {
	
		Son o= new Son();
		o.fname();
		o.sname();
		Daughter d=new Daughter();
		//d.fname();
		d.dname();


	}

}
