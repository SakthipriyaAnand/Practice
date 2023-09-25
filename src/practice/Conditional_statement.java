package practice;

public class Conditional_statement {

	public static void main(String[] args) {
		
		int n=10;
		if (n<50) {
			System.out.println("The value of n is: "+n);
		
		if (n>5) {
			System.out.println("the value of n is greater than 5: "+n);
		}
		}
		else {
			System.out.println("The value is greater than n");
		}
		
		System.out.println("----------------------------------------");
		
		int n1=50;
		if (n1>150) {
			System.out.println("The value of n1 is:"+n1);
		}
		else if (n1>100){
			System.out.println("The value of n2 is: "+n1);
		}
		else if (n1>70) {
			System.out.println("The value of n3 is: "+n1);
		}
		else {
			System.out.println("The value of n4 is: "+n1);
		}
		System.out.println("-----------------------------------------");
		
		System.out.println("switch case");
		//switch statement
		int n2=50;
		switch(n2) {
			case 50:
				System.out.println("The value of n2 is: "+n2);
				//break;
			case 100:
				System.out.println("The value of n2 is: "+n2);
				//break;
			default:
				System.out.println("The value of n2 is: "+n2);
		}
	}

}
