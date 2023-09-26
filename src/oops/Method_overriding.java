package oops;
class A{
	public void method1() {
		System.out.println("class A");
	}
	public static void method4() {
		System.out.println("static method in class A");
	}
}

class B extends A{
	public void method2() {
		System.out.println("class B");
		//super.method1();
	}
	public static void method3() {
		System.out.println("class c");
	}
	@Override
	public void method1() {
		System.out.println("class A1");
		//this.method2();
	}
	public static void method4() {
		System.out.println("static method in class B");
	}
}
public class Method_overriding extends  B{

	public static void main(String[] args) {
		
		Method_overriding m=new Method_overriding();
		m.method1();//non static overridden method 
		m.method2();//non static method in class B
		//m.method3();// static methods cannot be overridden
		B.method3();// static methods cannot be overridden
		B.method4();//static method in class A
		A.method4();//static method in class B
	}

}
