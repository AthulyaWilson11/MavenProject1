package Polymorphism;

public class SamplePolymorhism {
	
	public void add(int x) {
		System.out.println("x: "+x);
	}
	public void add (int z, int y) {
		System.out.println("add"+(z+y));
		
	}
	public void add(String fname, String sname) {
		String name=fname+" "+sname;
		System.out.println("full name"+name);
	}

	public static void main(String[] args) {
		SamplePolymorhism sp=new SamplePolymorhism();
		sp.add(10);
		sp.add(10,12);
		sp.add("athulya", "wilson");
		

	}

}
