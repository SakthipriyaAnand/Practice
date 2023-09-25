package oops;


	class Parent_class1{
		 public void m1() {
			 System.out.println("this is parent class");
		 }
		}
		 class Child_class1 extends Parent_class1{
			 public void m2() {
				 System.out.println("This is child class");
				 super.m1();
			 }
				 @Override 			//important
				 public void m1() {
					 System.out.println("This is not a parent class");
				 
			 }
		 }
				 public class Overriding extends Child_class1 {
						public static void main(String[] args) {
							Overriding e1= new Overriding();
							e1.m1();
							
						}
				 }

	


