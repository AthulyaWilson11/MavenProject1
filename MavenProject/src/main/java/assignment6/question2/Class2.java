package assignment6.question2;
// Class 2 Calculate hra (5% of basic pay) and pf (20% of basic pay). 

public class Class2 extends Class1{
	double hra;
	double pf;
	public void set() {
		 hra= basicpay*(5./100);
		pf=basicpay*(20./100);
	}

}
