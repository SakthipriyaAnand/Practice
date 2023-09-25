package oops;

public class Inte {
	int p=1;
	void method() {
		 System.out.println("parent class");
	 }
		public static void main(String[] args) {
			Daughter1 c=new Daughter1();
			c.method1();
			System.out.println(c.p);
			System.out.println(c.d);
			c.method();
			

		}

	}
	class Daughter1 extends Inte{
		int d=2;
		void method1() {
			System.out.println("child class");
		}
	
		

	

}
