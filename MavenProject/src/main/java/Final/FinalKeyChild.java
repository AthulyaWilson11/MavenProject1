package Final;

public class FinalKeyChild extends Final_KeyParent {	//inherited
	
	/*public void fmethod1(int a, String name) {			//cannot override while using final method
		
	} */
public void check(String place) {
	System.out.println(place);
}
	
	
	public static void main(String[] args) {
		FinalKeyChild ob=new FinalKeyChild();
		ob.check("neeloor");
		ob.fmethod1(12,"anu");

	}

}
