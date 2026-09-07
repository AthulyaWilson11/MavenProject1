package assignment9.question2;
//RBI will be an interface, have a method recurringDeposit which can accept the amount and duration. 
	//Interest rate is defined in RBI interface.
public interface RBI {
	double interestrate=7.0;
	public abstract void recurringDeposit(double amount,int duration);

}
