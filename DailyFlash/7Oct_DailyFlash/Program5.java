/*	Write a program to calculate average of each student from given marks. Note that
 *	number of test for each student varies, hence calculate accordingly.
 *	Student 1 - 50 60 70 90
 *	Student 2 - 20 40 80
 *	Student 3 - 55 77 66 91*/

import java.util.*;


class Program5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Students: ");
		int row = sc.nextInt();

		int[][] arr = new int[row][];

		for(int i = 0; i < row; i++) {
		
			System.out.print("Enter number of test given by Student "+(i+1)+": ");
			arr[i] = new int[sc.nextInt()];
		}

		System.out.println("Enter Marks: ");
		for(int i = 0; i < row; i++) {
		
			System.out.print("Enter Marks for Student "+(i+1)+":");
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Avegrage of Students: ");
		for(int i = 0; i < row; i++) {
		
			int sum = 0;
			for(int j = 0; j < arr[i].length; j++) {
			
				sum = sum + arr[i][j];
			}
			System.out.println("Student "+(i+1)+": "+(double)(sum/arr[i].length));
		}
	}
}
