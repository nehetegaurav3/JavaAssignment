

class MultiArrayDemo {

	public static void main(String[] args) {
	
		//int arr[][] = {1,2,3,4,5,6,7,8,9};		//Error: int can't be converted to int[]

		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};	//Solution to above problem
		
		//int arr[][] = {{1,2,3},{5},{8,9}};		//Throws ArrayIndexOutOfBound Exception
								//Java calls this as Jagged Array.
		int arr[][] = {{1,2,3},{5,0,0},{8,9,0}};	//Only Solution to above problem.

		System.out.println("Array is: ");
		for(int i = 0; i < 3; i++) {
		
			for(int j = 0; j < 3; j++) {
			
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
