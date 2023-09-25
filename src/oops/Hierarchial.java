package oops;


	class Parent2{
		public void first1() {
			System.out.println("First parent class");
		}
	}
	class Child11 extends Parent2{
		public void second1() {
			System.out.println("First child class");
		}
		public static void second11() {
			System.out.println("second static child class");
		}
	}
	class Child12 extends Parent2{
		public void third1() {
			System.out.println("Second child class");
		}
		public void third11() {
			System.out.println("third child class");
		}
	}
	public class Hierarchial {
	public static void main(String[] args) {
		Child12 ch=new Child12();
		ch.first1();
		ch.third1();
		ch.third11();
	
	}

}
