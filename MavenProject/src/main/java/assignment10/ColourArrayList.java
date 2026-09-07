package assignment10;

//Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;

public class ColourArrayList {

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
		System.out.println(arr);

	}

}
