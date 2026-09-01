package Aggregation;

public class Address {
	// Get the address of student 
	//Print Student name, roll number with address 
	//There is no IS-A relationship
	
	String address;
	Student st;
	void getaddress(String add,Student st) {
		this.address=add;
		this.st=st;
		System.out.println("address: "+add);   //1 print
		System.out.println("student full details: "+st.studentname+" "+st.rollnumber+" "+add);		//2nd print
	}
	


	public static void main(String[] args) {
		Student stu=new Student();
		stu.getnameandnumber("SALY WILSON", 1621);
		
		Address ad=new Address();
		ad.getaddress("Pala,Kottayam", stu);
				
	}

}
