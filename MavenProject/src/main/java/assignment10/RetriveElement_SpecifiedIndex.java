package assignment10;
//Java program to retrieve an element (at a specified index) from a given array list. 

import java.util.ArrayList;

public class RetriveElement_SpecifiedIndex {

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
		
		System.out.println("size of an arraylist"+arr.size()); //8
		System.out.println("element at index position 6 is: "+arr.get(6));

	}

}
