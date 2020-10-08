/*	Write a program to print jagged array of cubes of numbers from 10 to 1. Use for loop
 *	to initialize array and print it.*/


class Program3 {

	public static void main(String[] args) {
	
		int[][] arr = new int[4][];
		
		for(int i = 0; i < 4; i++) {

			arr[i] = new int[i+1];
		}

		int cnt = 10;
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = cnt*cnt*cnt;
				cnt--;
			}
		}
		
		System.out.println("Array of Cubes: ");
		for(int i = 0; i < 4; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
