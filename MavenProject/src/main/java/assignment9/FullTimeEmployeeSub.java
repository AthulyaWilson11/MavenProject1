package assignment9;

//FullTimeEmployee also has its own implementation of calculateSalary()method.
//In this case we just multiply by constant 8 hours.

public class FullTimeEmployeeSub extends EmployeeSuper {
	int payment=500;
	
	public void calculateSalary() {
	int	salary=8*payment;
	System.out.println("Salary of employee: "+salary);
		
	}

	public static void main(String[] args) {

		FullTimeEmployeeSub fte=new FullTimeEmployeeSub();
		fte.calculateSalary();
		
		ContractorSub con=new ContractorSub();
		con.calculateSalary();

	}	

}
