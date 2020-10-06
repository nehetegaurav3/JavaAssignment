import java.util.*;


class Program3 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Planes: ");
		int plane = sc.nextInt();
		System.out.print("Enter Number of Rows: ");
		int row = sc.nextInt();
		System.out.print("Enter Number of Columns: ");
		int col = sc.nextInt();

		int[][][] arr = new int[plane][row][col];

		int sum = 0;

		System.out.println("Enter array elements: ");
		for(int i = 0; i < plane; i++) {
		
			for(int j = 0; j < row; j++) {
			
				for(int k = 0; k < col; k++) {
				
					arr[i][j][k] = sc.nextInt();
					
					if(i == 0)
						sum = sum + arr[i][j][k];
				}
			}
		}
		System.out.println("Sum of first plane elements = "+sum);
	}
}
