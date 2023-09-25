package practice2;

public class Array_example {

	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		arr[2]=30;							//to change the value of particular array with index value
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("Length: "+arr.length); //to get the length of an array
System.out.println("-------------------------------------------------");	
	System.err.println("using for loop");
	int[] arr1 = {11,22,33,44,55};
		
		for(int i=0; i<arr1.length; i++){
			System.out.println("arr["+i+"]="+arr1[i]);
		}
		
System.out.println("-------------------------------------------------------");		
	System.err.println("using enhanced for loop");
	int[] arr2 = {11,22,33,44,55};
	
	for(int count:arr2) {
		System.out.println(count);
	}
System.out.println("-------------------------------------------------------");	
	System.err.println("2D array");
	int[][] arr3= {
			{11, 22, 33},
			{44, 55, 66},{77,88,99}
	};

	System.out.println(arr3[0][0]);
	System.out.println(arr3[0][1]);
	System.out.println(arr3[0][2]);
	System.out.println(arr3[1][0]);
	System.out.println(arr3[1][1]);
	System.out.println(arr3[1][2]);
	System.out.println(arr3[2][0]);
	System.out.println(arr3[2][1]);
	System.out.println(arr3[2][2]);
	
	}

}
