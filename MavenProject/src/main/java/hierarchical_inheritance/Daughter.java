package hierarchical_inheritance;

public class Daughter extends Father{ 
	
	public void dname() {
		String name="athulya";
		System.out.println(name);
	}

	public static void main(String[] args) {
		
		Daughter d=new Daughter();
		d.dname();
		

	}

}
