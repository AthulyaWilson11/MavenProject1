package encapsulation;

public class Bank {
	private int pin1;
	
	void setPin(int pin1){		//set pin
		this.pin1=pin1;
		
	}

	boolean validatePin() {				//validate
		return pin1==1001|| pin1==1234||pin1==1212;
		
	}

}
