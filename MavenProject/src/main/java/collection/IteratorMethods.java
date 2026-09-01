package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMethods {

	public static void main(String[] args) {
		//list
		List<Integer>l=new ArrayList<Integer>();
		//add
		l.add(10);
		l.add(20);
		l.add(30);
		System.out.println(l);
		//Iterator
		Iterator<Integer>it=l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			//remove
		it.remove();
		System.out.println(l);
		
		//System.out.println(it.next());
	}

}
