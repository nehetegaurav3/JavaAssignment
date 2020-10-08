import java.util.*;


class Program3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rows: ");
		int row = sc.nextInt();

		int[][] arr = new int[row][];

		for(int i = 0; i < row; i++) {
		
			System.out.print("Number of elements in row "+(i+1)+": ");
			arr[i] = new int[sc.nextInt()];
		}
		
		int sum = 0;

		System.out.println("Enter Input: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
				sum = sum + arr[i][j];
			}
		}

		System.out.println("Sum = "+sum);
	}
}
