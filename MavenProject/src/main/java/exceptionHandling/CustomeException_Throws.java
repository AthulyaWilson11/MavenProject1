package exceptionHandling;

public class CustomeException_Throws {

	public static void main(String[] args) throws VotingException {
		int age=15;
		if(age>=18) {
			System.out.println("eligible for vote");
		}
		else {
			throw new VotingException("not eligible due to age under 18");
		}

	}

}
