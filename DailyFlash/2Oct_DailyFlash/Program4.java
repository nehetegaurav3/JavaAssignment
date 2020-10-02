import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of rows: ");
		int row = Integer.parseInt(br.readLine());
		System.out.print("Enter number of columns: ");
		int col = Integer.parseInt(br.readLine());

		int arr[][] = new int[row][col];

		System.out.println("Enter array elements:");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		System.out.println("Entered Array is: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Hour Glass: ");
		for(int i = 0; i < 3; i++) {
		
			for(int j = 0; j < 3; j++) {
			
				if (i == 0 || i == 2)
					System.out.print(arr[i][j]+" ");
				else if (i == 1 && j == 1)
					System.out.print(arr[i][j]+" ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
