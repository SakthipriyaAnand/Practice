package oops;
class A{
	public void method1() {
		System.out.println("class A");
	}
}

class B extends A{
	public void method2() {
		System.out.println("class B");
		super.method1();
	}
	public static void method3() {
		System.out.println("class c");
	}
	@Override
	public void method1() {
		System.out.println("class A1");
		this.method2();
	}
}
public class Method_overriding extends  B{

	public static void main(String[] args) {
		
		Method_overriding m=new Method_overriding();
		m.method1();
		m.method2();
		//m.method3();
		//B.method3();
		
	}

}
