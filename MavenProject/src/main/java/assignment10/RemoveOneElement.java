package assignment10;

//Write a Java program to remove the third element from a array list

import java.util.ArrayList;

public class RemoveOneElement {

	public static void main(String[] args) {
ArrayList <String> arr=new ArrayList<String>();
		
		arr.add("RED");
		arr.add("BLUE");
		arr.add("GREEN");  //3
		arr.add("YELLOW");
		arr.add("INDIGO");
		arr.add("BLACK");
		arr.add("PINK");
		arr.add("BROWN");
		System.out.println("Before removing arraylist elements: "+arr);
		arr.remove(2);
		System.out.println("After removing arraylist elements: "+arr);

	}

}
