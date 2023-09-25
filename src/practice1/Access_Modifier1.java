package practice1;

import practice.*;

public class Access_Modifier1 extends Access_Modifier{

	public static void main(String[] args) {
		Access_Modifier a2=new Access_Modifier();
		a2.met4();				//public method
		Access_Modifier.met04();
		Access_Modifier.met06();
		
		//A.met07();
		
		
		Access_Modifier1 a4=new Access_Modifier1(); //main class
		a4.met6(); //protectd method

		
//		B a3=new B();
//		a3.met5();
//		A a1=new A();
//		a1.met1();
	//	B a4=new B();
	}

}
