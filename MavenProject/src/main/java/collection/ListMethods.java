package collection;

import java.util.LinkedList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		//list
		List<Integer> a=new LinkedList<Integer>();
//methods
	// 1.add
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(30);
		a.add(30);	
		a.add(50);
		System.out.println(a);
	// 2.get
		System.out.println("value in index position 4: "+a.get(4));
		
	// 3.set
		a.set(0, 60);
		System.out.println("new array: "+a);
		
	// 4.size
		System.out.println("size of array: "+a.size());
		
	// 5. isEmpty
		System.out.println("empty check:"+a.isEmpty());
		
	// 6. remove
		a.remove(3);
		System.out.println("new: "+a);
		
	// 7.contains
		System.out.println(a.contains(60));
		System.out.println(a.contains(100));
		
	// 8.indexOf
		System.out.println("index position 60: "+ a.indexOf(60));
		
	//lastIndexOf
		System.out.println("last index of 30: "+a.lastIndexOf(30));
		
	}
	

}
