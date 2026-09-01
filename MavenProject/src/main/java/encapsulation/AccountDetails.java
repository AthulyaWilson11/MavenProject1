package encapsulation;

public class AccountDetails {
private int acco;
private String name;
private double amount;
private int pin;

void setacc(int a) {
	this.acco=a;
}
 int getacc() {
	 return acco;
 }
 
void setname(String n) {
	this.name=n;
}
String getname() {
	return name;
}

double getAmount() {
	return amount;
}
void setAmount(double amount) {
	this.amount = amount;
}

void setpin(int pin) {
	this.pin=pin;
}
boolean validatepin() {
	return pin==1111 || pin==1212;
}
}
