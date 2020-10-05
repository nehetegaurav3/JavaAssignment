import java.util.*;


class MultiArrayDemo {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter Columns: ");
		int col = sc.nextInt();

		char arr[][] = new char[row][col];

		System.out.println("Enter Elements: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				arr[i][j] = sc.next().charAt(0);
			}
		}
		
		System.out.println("Entered Elements: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
