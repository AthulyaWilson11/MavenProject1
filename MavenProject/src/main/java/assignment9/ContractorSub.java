package assignment9;

//The Contractor class inherits all properties from its parent Employee
// multiply the value of payment per hour with given working hours. 


public class ContractorSub extends EmployeeSuper{
	int workinghours=8;
	int payment=700;
	int salary;
	
	public  void calculateSalary() {					//override
		salary=workinghours*payment;
		System.out.println("Contractor Salary: "+salary);
	}
	
	

}
