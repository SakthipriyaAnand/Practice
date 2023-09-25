package practice;

public class Variables {

	public static void main(String[] args) {
		
		// non-static method
		Method1 e= new Method1();
		e.one();
		Method2 e1= new Method2();
		e1.three();
		Method3 e2= new Method3();
		e2.five();
		Method4 e3= new Method4();
		e3.seven();
		Method5 e4= new Method5();
		e4.nine();
		
		//static method
		Method1.two();
		Method2.four();
		Method3.six();
		Method4.eight();
		Method5.ten();
		
	}

}

class Method1{
	
	public void one() {
	
	int a=2,b=3;
	int c=a+b;
	System.out.println(c);

	}
	public static void two() {
		int a1=2,b1=4;
		int c1=a1+b1;
		System.out.println(c1);
	}
}

class Method2{
	
	public void three() {
	
	int d=1,f=3;
	int g=d+f;
	System.out.println(g);

	}
	public static void four() {
		int d1=1,f1=4;
		int g1=d1+f1;
		System.out.println(g1);
	}
}

class Method3{
	
	public void five() {
	
	int h=3,i=3;
	int j=h+i;
	System.out.println(j);

	}
	public static void six() {
		int h1=3,i1=4;
		int j1=h1+i1;
		System.out.println(j1);
	}
}

class Method4{
	
	public void seven() {
	
	int k=3,l=3;
	int m=k+l;
	System.out.println(m);

	}
	public static void eight() {
		int k1=3,l1=4;
		int m1=k1+l1;
		System.out.println(m1);
	}
}

class Method5{
	
	public void nine() {
	
	int n=3,o=3;
	int p=n+o;
	System.out.println("nine= "+p);

	}
	public static void ten() {
		int n1=3,o1=4;
		int p1=n1+o1;
		System.out.println("ten= "+p1);
	}
}