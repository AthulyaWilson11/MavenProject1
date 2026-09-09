package assignment5;

public class Grade {
	
	public Grade(int s1,int s2, int s3){
		int total=s1+s2+s3;	
		System.out.println(total);
		if(total>=150) {System.out.println("A");}
	}
	public Grade(double su3, double su2, double su1) {
		double total=su1+su2+su3;	
		System.out.println(total);
	}

	public static void main(String[] args) {
		
		Grade ob1=new Grade(60,80,90);
		Grade ob2=new Grade(90,80,90);
		

	}

}
