package assignment9.question2;

//When a customer deposit amount in HDFC, they must be able to know how much amount they will get after depositing for n period of time. 

public class HDFC implements RBI{
	
	public void recurringDeposit(double amount, int duration) {
		double interestamount=(amount*duration*interestrate)/100;
		double totalamount=interestamount+amount;
		
		System.out.println("Deposit:"+ amount);
		System.out.println("duration"+duration+"years");
		System.out.println("interest: "+interestamount);
		System.out.println("final:"+ totalamount);
		
		
	}
	public static void main(String[] args) {
		HDFC oh=new HDFC();
		oh.recurringDeposit(20000, 2);

	}

	
	

}
