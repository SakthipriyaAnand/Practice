package practice;

 public class Access_Specifier {
	public static void name() {
		System.out.println("hello");
	}
	private static void name1() {
		System.out.println("hi");
	}
	 
	protected static void name3() {
		System.out.println("protected");
		
	}

	static void name4() {
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		//Access_Specifer obj= new Access_Specifer();
		Access_Specifier.name();
		Access_Specifier.name1();
	}
}
