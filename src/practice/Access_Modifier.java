package practice;

public class Access_Modifier {

	public static void main(String[] args) {
		Access_Modifier.met03();
		Access_Modifier.met04();
		Access_Modifier.met06();
		Access_Modifier a2=new Access_Modifier();
		a2.met3();
		a2.met4();
		a2.met6();
System.out.println("-----------------------------------");
		A a1=new A();
	  //a1.met() 		//not possible its private
		a1.met1();
		a1.met2();
		a1.met7();
		A.met07();
System.out.println("-----------------------------------");		 
		B a3=new B();
		a3.met5();//protected
		
	}
	
	
	public void met4() {	//call this in another package(practice1) because it is public
		System.out.println("public in Access_Modifier ");
	}

	void met3() {
		System.out.println("Default in Access_Modifier");
	}
	protected void met6() {
		System.out.println("protected in Access_Modifier ");
	}

	public static void met04() {	//call this in another package(practice1) because it is public
		System.out.println("public static in Access_Modifier ");
	}

	static void met03() {
		System.out.println("Default static in Access_Modifier");
	}
	protected static void met06() {
		System.out.println("protected static in Access_Modifier ");
	}

}


 class A{
	 private int a=10,b=20;
	 private void met(){  //private method
		 System.out.println("Private in class A");
	 }
	 public void met1() {  //public method
		 System.out.println("public in class A");
		 System.out.println(a);
		 met();
	 }
	 void met2() { //default method
		 System.out.println(b);
		 met();
	 }
	 protected void met7() {
		 System.out.println("protected in class A");
	 }
	 protected static void met07() {
		 System.out.println("protected in class A");
	 }
 }
 
 
 class B{
 //class B extends Access_Modifier { //protected method
	 protected void met5() {
		 System.out.println("protected in class B");
		 //B a4=new B();
		 
	 }
 }
 