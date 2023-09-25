package practice;

import java.util.Scanner;

public class User_input {
	public static void main(String[] args) {
//		Scanner User_input= new Scanner(System.in);
//		System.out.println("Enter first input: ");
//		int a=User_input.nextInt();
//		System.out.println("Enter second input: ");
//		int b=User_input.nextInt();
//		int c=a+b;
//		System.out.println("Total= "+c);
		
		
		//String website=
//		System.out.println("Enter the string: ");
//		String d = User_input.nextLine();
//		
//		
//		System.out.println("hello user"+d);
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string  
		System.out.print("You have entered: "+str); 
		sc.close();
		//User_input.close();
	}

}
