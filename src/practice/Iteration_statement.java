package practice;

public class Iteration_statement {

	public static void main(String[] args) {
		// For loop
		System.out.println("for loop");
		for(int i=1;i<=5;i++) {
			System.out.println("The value of i is: "+i);
		}
		System.out.println("-------------------------------------");
		
		//enhanced for loop
		System.out.println("enhanced for loop");
		int fl[]= {1,2,3,4,5};
		for(int count:fl) {
			System.out.println("count is: "+count);
		}
		System.out.println("---------------------------------------");
		
		//nested for loop 
		//increment
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		
		//decrement
		int t=5;
		for(int i=1;i<=t;i++){
			for(int j=t;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
System.out.println("---------------------------------------------------");
//while loop

int w=1;
while(w<=5) {
	System.out.println(w);
w++;
}

System.out.println("-----------------------------------------------------");

//do while

int dw=6;
do {
	System.out.println(dw);
	dw++;
}while(dw<=10);

	}

}
