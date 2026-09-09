package assignment6.question2;
//Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip 
//Salary slip  contains :- basic pay, deduction, hra, pf, bonus and total salary by hand.

public class TotalSalary extends Class2{

	public void total() {
		double totalsalary=basicpay+hra-pf-deduction+bonus;
		
		System.out.println("SalarySlip:");
		System.out.println("basic pay"+ basicpay);
		System.out.println("deduction"+deduction);
		System.out.println("hra"+hra);
		System.out.println("bonus"+bonus);
		System.out.println("totalsalary"+totalsalary);
		
	}
	public static void main(String[] args) {
		
		TotalSalary ob=new TotalSalary();
		ob.get();
		ob.set();
		ob.total();
	}

}
