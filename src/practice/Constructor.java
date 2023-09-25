package practice;

public class Constructor {

	public static void main(String[] args) {
		Nine e=new Nine();
		Nine e1=new Nine(10,20);
		e1.ten();
		e.ten();
		
	}

}
 class Nine{
	 Nine(){
		 System.out.println("default constructor");
	 }
	 Nine(int a,int b){
		 System.out.println("a+b="+(a+b));
	 }
	 
	 public void ten(){
		 System.out.println("not a constructor");
	 }
 }
 