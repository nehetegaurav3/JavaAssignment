import java.util.*;


class Program1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rows: ");
		int row = sc.nextInt();

		int[][] arr = new int[row][];

		for(int i = 0; i < row; i++) {
		
			System.out.print("Number of Elements on Row "+(i+1)+": ");
			arr[i] = new int[sc.nextInt()];
		}

		for(int i = 0; i < row; i++) {
		
			System.out.println("Enter elements in Row "+(i+1)+": ");
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Jagged Array: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
