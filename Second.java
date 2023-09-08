package first;

public class Second {

		// Methods are used to perform certain actions, and they are also known as functions.
		

	// Creating Method

//	static void display() {  // void means that this method will return nothing
//		System.out.println("Hello I just got Executed");
//	}
//	
//					//here we give our method some parameters after giving our method any name
//	
//	static int add(int a,int b) { // Now we have set a data type by replacing void because our method will return something
//		int c;
//		c = a + b;
//		return c;
//	}
	
	//Creating bubble sort function
	
	public static void bubbleSort(int arr[],int n) {
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	
	}
	
	// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
	
	public static void main(String[] args) {
//		display(); // Calling our method also called user defined function
//		System.out.println("Addition of two numbers : "+add(2,3)); // Calling method in S.o.u.t
		int n = 5;
		int[] arr = {54,44,33,22,10};
		
		bubbleSort(arr,n); // calling funtion by providing arguments
		
		for(int k = 0;k<5;k++) {
			System.out.println(arr[k]);
		}
	}
}
