/*	Write a program that calculates the total number of books read by person with total number
 *	of people being 4. Note that the number of peoples represent rows and number of books
 *	in each column represent books read by them during weeks. Given are the stats, initialize
 *	array accordingly and later print sum of books read by each person.
 *	Person 1 - 2 3 4 5
 *	Person 2 - 1 2
 *	Person 3 - 5 8 2 1 2
 *	Person 4 - 1 2 7*/

import java.util.*;


class Program4 {

	public static void main(String[] args) {
	
		int[][] arr = new int[4][];

		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 4; i++) {
		
			System.out.print("Enter number of weeks Person "+(i+1)+" read book: ");
			arr[i] = new int[sc.nextInt()];
		}

		for(int i = 0; i < 4; i++) {
		
			System.out.print("Books read by Person 1: ");
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Total books read: ");
		for(int i = 0; i < 4; i++) {
		
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
			
				sum = sum + arr[i][j];
			}
			System.out.println("Total books of Person "+(i+1)+" = "+sum);
		}
	}
}
