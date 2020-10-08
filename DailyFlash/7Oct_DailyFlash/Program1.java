/*	Write a program that creates a jagged array with 3 rows. Ask user for input for number 
 *	of columns in each row. Pass the given input values to the array, take input from the
 *	user for the array and print the array*/

import java.util.*;


class Program1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Columns in Row 1: ");
		int col1 = sc.nextInt();
		System.out.print("Enter Columns in Row 2: ");
		int col2 = sc.nextInt();
		System.out.print("Enter Columns in Row 3: ");
		int col3 = sc.nextInt();

		int[][] arr = new int[3][];
		arr[0] = new int[col1];
		arr[1] = new int[col2];
		arr[2] = new int[col3];

		System.out.println("Enter Elements: ");
		for(int i = 0; i < 3; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Array: ");
		for(int i = 0; i < 3; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
