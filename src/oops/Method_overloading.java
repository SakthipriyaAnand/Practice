package oops;

public class Method_overloading {
	String name;
	int id;
	public void info(String name) {
		System.out.println(name);
	}
	public void info(int id) {
		System.out.println(id);
	}
	public void info(String name,int id) {
		System.out.println("Name: "+name+"\n"+"Id:"+id);
	}
	public static void main(String[] args) {
		Method_overloading e= new Method_overloading();
		e.info("sakthi priya",12 );

	}

}
