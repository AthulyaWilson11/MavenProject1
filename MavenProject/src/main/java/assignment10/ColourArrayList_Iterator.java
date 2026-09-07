package assignment10;

import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in a array list. 

public class ColourArrayList_Iterator {

	public static void main(String[] args) {
		
		ArrayList <String> arr=new ArrayList<String>();
		
		arr.add("RED");
		arr.add("BLUE");
		arr.add("GREEN");
		arr.add("YELLOW");
		arr.add("INDIGO");
		arr.add("BLACK");
		arr.add("PINK");
		arr.add("BROWN");
		
	Iterator<String> it=arr.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
	}
		
	}

}
