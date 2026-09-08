package assignment7.question2;
//Class 2- Address • Get the address of student • Print Student name, roll number with address 
// There is no IS-A relationship

public class Address extends Student{
	String address;
	Student stu;
	public void getdata(String add,Student stu) {
		this.address=add;
		this.stu=stu;
		System.out.println("address: "+add);
		System.out.println("Student name: "+stu.name);
		System.out.println("roll number with address: "+stu.rollnumber+address);
		
	}
	
	
	public static void main(String[] args) {
	
		Student obs= new Student();
		obs.details("peeku", 1123);
		
		Address oba=new Address();
		oba.getdata("pala,kottayam", obs);

	}

}
