package practice;

public class Jump_statement {

	public static void main(String[] args) {
		//for loop using break 
		for(int n=1;n<=5;n++) {
			if(n==3) {
				//System.out.println("n="+n);
				break;
			}
			System.out.println(n);
		}
System.out.println("-----------------------------------------");

		//nested for loop using break and lable 
		aa: //lable
		for(int i=1;i<=3;i++) {
		
		bb:	
			for(int j=1;j<=3;j++) {
				
				if(i==2 && j==2) {
					System.out.println("i="+i+"j="+j);
					break bb;//if we use bb it will only break i=2&j=3 and print i=3&j=1 and soon
				}
				System.out.print(i+" ");
				System.out.println(j);
			}
		}
System.out.println("----------------------------------------");

		//continue
			for(int n1=1;n1<=5;n1++) {
				if(n1==4) {
					//System.out.println("n1="+n1);
					continue;
				}
					System.out.println(n1);
			}
System.out.println("---------------------------------------------");

			// continue using do while

			int t=10;
			do {
				if(t==14) {
					continue;
					//break;
				}
				System.out.println(t);
				t++;
			}while(t<=15);
			
	}

}
