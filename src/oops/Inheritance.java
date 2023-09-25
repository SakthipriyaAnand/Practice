package oops;

public class Inheritance {
	
	public static void main(String[] args) {
		Child e=new Child();
		e.employee();
		e.prog();
	}
	}
	
	class Parent{
		void employee() {
		System.out.println("Employee name");	
		}
	}
	
	class Child extends Parent{
		void prog() {
			System.out.println("Details");
		}
	}
	
		

	


