package oops;

public class Array_for {

	public static void main(String[] args) {
		int[] arr= {11,22,33,44};
		String s1[]= {"sakthi","Java","oops","project"};
		for (int i = 0; i < s1.length; i++) {
			System.out.println(arr[i]+" " +s1[i]);
			//System.out.println(s1[i]);
		}
System.out.println("-------------------------------------------");

		for (int i:arr) {
			System.out.println(i);
		}
		for (String i1:s1) {
			System.out.println(i1);
		}
	}

}
