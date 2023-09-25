package practice;

public class Ret_type {

	public static void main(String[] args) {
		 
		sa e=new sa();
		e.one();
		//int f=e.two(2,3); //not working
		System.out.println(e.two(2, 3));
	}

}
 class sa{
	 public void one() {          // no return type
		 System.out.println("There is no return type");
	 }
	 
	 public int two(int a,int b) { //with return type with arguments
		 int c=a+b;
		 return c;
	 }
 }