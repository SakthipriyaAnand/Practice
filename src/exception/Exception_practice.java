package exception;

import java.util.Scanner;

public class Exception_practice {
		private static void e1() {
			int a=1,b=0;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a/b);// it will throw error because anything / 0 is undefined
			System.out.println("exception");
		}
		
		private static void e2() {
			// null point exception
			String s=null;
			int l=s.length();
			System.out.println(l);
		}
		
		private static void e3() {
			//boundary value exception
			int arr[]=new int[3];
			arr[0]=1;
			arr[1]=2;
			arr[2]=3;
			System.out.println(arr[4]);
			
		}
		
		private static void e4() {
			String s1="java";
			System.out.println(s1.charAt(5));
		}
		
		private static void e5() {
			String s2="private";
			int a=Integer.parseInt(s2);
			int b=20+a;
			System.out.println(b);
		}
		private static void e6() {
			Scanner sc=new Scanner(System.in);
			int nextInt = sc.nextInt();
			System.out.println(nextInt);
		}
		
		private static void e7() {
			//using try catch with / zero exception
			int aa=1,bb=0;
			try {
				System.out.println(aa+bb);
				System.out.println(aa/bb);
				System.out.println("catch exception");
			}
			catch(ArithmeticException e){
				e.printStackTrace();
				
			}
		}
	public static void main(String[] args) {
		//e1();
		//e2();
		//e3();
		//e4();
		//e5();
		//e6();
		e7();
	}

}
