package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		Set<Integer>ac=new HashSet<Integer>();
		// add
		s.add(10);
		s.add(20);
		s.add(30);
		
		ac.add(100);
		ac.add(200);
		ac.add(300);
		System.out.println("set s values"+s);
		System.out.println("set ac values"+ac);
		
		//addAll
		
		s.addAll(ac);
		System.out.println("added set"+ s);
		
		//size
		System.out.println(s);
		
		//isEmpty
		System.out.println(ac.isEmpty());
		
		//contains
		System.out.println(s.contains(400));
		
		//containsAll
		System.out.println(s.containsAll(ac)); // ac added to s
		
		//remove
		System.out.println(s.remove(30));
		System.out.println(s); //cheking the removel
		
		//removeAll
		s.removeAll(ac);
		System.out.println(s);
		
		//clear
		s.clear();
		System.out.println(s);
		
		
	}

}
