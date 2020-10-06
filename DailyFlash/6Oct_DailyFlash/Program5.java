import java.util.*;


class Program5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Planes: ");
		int plane = sc.nextInt();
		System.out.print("Enter Number of Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter Number of Columns: ");
		int col = sc.nextInt();

		int[][][] arr = new int[plane][row][col];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < plane; i++) {
		
			for(int j = 0; j < row; j++) {
			
				for(int k = 0; k < col; k++) {
				
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Numbers Divisible by 5 in array: ");
		for(int i = 0; i < plane; i++) {
		
			for(int j = 0; j < row; j++) {
			
				for(int k = 0; k < col; k++) {
				
					if(arr[i][j][k] % 5 == 0)
						System.out.print(arr[i][j][k] + " ");
				}
			}
		}
		System.out.println();
	}
}
