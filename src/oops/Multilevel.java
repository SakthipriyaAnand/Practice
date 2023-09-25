package oops;
class Parent1{
	public void first() {
		System.out.println("First parent class");
	}
}
class Child1 extends Parent1{
	public void second() {
		System.out.println("First child class");
	}
}
class Child2 extends Child1{
	public void third() {
		System.out.println("Second child class");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		Child2 mu=new Child2();
		mu.first();
		mu.second();
		mu.third();
//		Parent1 p1=new Parent1();
//		p1.first();
//		

	}

}
