package excelRead;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException { 
		 
 		String s=ExcelCode.readStringData(1, 0); //method 1 string 	//second row and first column
 		System.out.println(s); 
 		
 		String s1=ExcelCode.readIntegerData(1, 1); //method 2 integer
 		System.out.println(s1); 
 		 
 		String r2=ExcelCode.readStringData(2, 0); 
 		System.out.println(r2); 
 		
 		String c2=ExcelCode.readIntegerData(2, 1); 
 		System.out.println(c2);
 		
 		String r3=ExcelCode.readStringData(3, 0); 
 		System.out.println(r3); 
 		
 		String c3=ExcelCode.readIntegerData(3, 1); 
 		System.out.println(c3);
 		
 		String r4=ExcelCode.readStringData(4, 0); 
 		System.out.println(r4); 
 		
 		String c4=ExcelCode.readIntegerData(4, 1); 
 		System.out.println(c4);
 		
 		String r5=ExcelCode.readStringData(5, 0); 
 		System.out.println(r5); 
 		
 		String c5=ExcelCode.readIntegerData(5, 1); 
 		System.out.println(c5);
  
 	} 
}
