import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Rows: ");
		int row = Integer.parseInt(br.readLine());
		System.out.print("Enter Columns: ");
		int col = Integer.parseInt(br.readLine());

		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		int[][] addArr = new int[row][col];

		System.out.println("Enter Array1 Elements: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				arr1[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Enter Array2 Elements: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				arr2[i][j] = Integer.parseInt(br.readLine());
				addArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println("Array Addition: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				System.out.print(addArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
