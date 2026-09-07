package assignment10;

import java.util.ArrayList;

public class SearchElement {

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
		
		if (arr.contains("BLACK")){
			System.out.println("element is found");
		}
		else {System.out.println("not found");}
	}

}
