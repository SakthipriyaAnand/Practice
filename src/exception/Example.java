package exception;

public class Example {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(010);
			
		}
		System.out.println(011);
		
System.out.println("------------------------------------");		
		String[] s= {"a","b","c"};
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
System.out.println("------------------------------------");		
		int a=5;
		for (int i = 1; i <=a; i++) {
			for (int j = 0; j <=i; j++) {
				if(i==j)
				System.out.println(a);
			}
		}
System.out.println("------------------------------------");				
		
		int b=2;
		for (int i = 1; i <=b; i++) {
			int d=i/b;
			System.out.println(d);
		}
			
System.out.println("------------------------------------");

		System.out.println("1\n2\n3\n4\n5");
		System.out.println("Hello\nSakthi");
		String w="sakthi";
		System.out.println(w.length());
		System.out.println(w.charAt(5));
System.out.println("------------------------------------------");

		 Met m= new Met();
		 //m.jk();
		 m.hk();
		 Met.jk();
		 m.gh();
			
		}
}
	class Met {
		Met(){
			int a=1,b=2,c;
			System.out.println(c=a+b); 
			System.out.println(c+=10);
		}
		public void hk() {
			System.out.println("how are you");
		}
		public static void jk() {
			System.out.println("hi");
		}
		public void gh() {
			System.out.println("Pugazhini");
			
		}
		}
	


