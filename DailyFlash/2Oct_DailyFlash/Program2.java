import java.io.*;


class Program2 {

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
		
		System.out.print("Even Numbers: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				if(arr[i][j] % 2 == 0)
					System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
		
		System.out.print("Odd Numbers: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				if((arr[i][j] % 2 == 1) || (arr[i][j] % 2 == -1))
					System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
}
