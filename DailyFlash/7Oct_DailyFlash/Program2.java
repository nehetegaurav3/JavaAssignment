/*	Write a program to print jagged array of squares of numbers from 1 to 10. Use for loop
 *	to initialize array and print it.*/


class Program2 {

	public static void main(String[] args) {
	
		int[][] arr = new int[4][];
		
		for(int i = 0; i < 4; i++) {

			arr[i] = new int[i+1];
		}

		int cnt = 1;
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = cnt*cnt;
				cnt++;
			}
		}
		
		System.out.println("Array of Squares: ");
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
