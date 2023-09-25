package practice;

public class Variable_types {
	static int a=10;						//static variable
	int aa=20;								//non static variable
	public static void main(String[] args) {
		int b=30;							//instant variable
		System.out.println(a);
		System.out.println(b);
		Variable_types ee= new Variable_types();
		System.out.println(ee.aa);
		System.out.println("--------------------------------------------");
		
		outer e=new outer();
		e.first();
		outer.second();
		System.out.println(e.p);
		System.out.println(outer.s);
		System.out.println("--------------------------------------------");
		
		inner e1=new inner();
		e1.first1();
		inner.second1();
		System.out.println(e1.p1);
		System.out.println(inner.s1);
		System.out.println("--------------------------------------------");
		
		inner1 e2=new inner1();
		e2.first2();
		inner1.second2();
		System.out.println(e2.p2);
		System.out.println(inner1.s2);
	}

}
class outer{
	static String s="hello";				//static variable
	String p="world";						//non static variable
	public void first() {
		String c="Sakthi ",d="Priya";		//local variable
		String f=c+d;
		System.out.println("My name is: "+f);
		
	} 
	
	public static void second() {
		int g=12;
		System.out.println(g);
		}
	} 
class inner{
	static String s1="hi";
	String p1="all";
	public void first1() {
		String c1="Sakthi ",d1="Priya";		//local variable
		String f1=c1+d1;
		System.out.println("My name is: "+f1);
		
	} 
	
	public static void second1() {
		int g1=12;
		System.out.println(g1);
		}
	} 

class inner1{
	static String s2="hi";
	String p2="all";
	public void first2() {
		String c2="Sakthi ",d2="Priya";		//local variable
		String f2=c2+d2;
		System.out.println("My name is: "+f2);
		
	} 
	
	public static void second2() {
		int g2=12;
		System.out.println(g2);
		}
	} 