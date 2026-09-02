package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//+ symbol shows all the imported details

public class ExcelCode {		//class
	
	// static variables
	
	static FileInputStream f; 	//to read excel file from the system 
 	static XSSFWorkbook w; 		// represent entire excel sheets
 	static XSSFSheet sh; 		//represent the sheet1, where we entered data
  
 	public static String readStringData(int row, int col) throws IOException { // read String data 
 		
 		// to open the excel file from the given location, f = new FileInputStream
 		f = new FileInputStream("C:\\Users\\ALAN WILSON\\git\\MavenProject1\\MavenProject\\src\\main\\resources\\ReadExcel.xlsx"); 
 		
 		//to load the file into memory using apache poi 
 		w = new XSSFWorkbook(f); 
 		
 		//to select Sheet1 data from the workbook
 		sh = w.getSheet("Sheet1"); // we entered values in sheet1
 		
 		// to get details form rows using row number
 		XSSFRow r = sh.getRow(row); 
 		
 		// to get the cell details in the row based on column number
 		XSSFCell c = r.getCell(col); 
 		
 		// to return values in text format
 		return c.getStringCellValue(); 
  
 	} 
  
 	public static String readIntegerData(int row, int col) throws IOException { //read integer data
 		
 		f = new FileInputStream("C:\\Users\\ALAN WILSON\\git\\MavenProject1\\MavenProject\\src\\main\\resources\\ReadExcel.xlsx"); 
 		
 		w = new XSSFWorkbook(f); 	//open
 		
 		sh = w.getSheet("Sheet1"); 	//load
 		
 		XSSFRow r = sh.getRow(row); 	//get row data
 		
 		XSSFCell c = r.getCell(col); 	//cell details of the row //double value will result
 		
 		int val =   (int) c.getNumericCellValue();  //convert double to int using typecasting 
 		
 		return String.valueOf(val);   //convert int to string using valueOf() method  // since we use string returntype
  
 	 
 	} 
}
