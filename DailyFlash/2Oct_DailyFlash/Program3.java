import java.io.*;


class Program3 {

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
		
		int arrCol[] = new int[col];
		int arrRow[] = new int[row];

		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				for(int k = 0; k < row; k++) {
				
					if(k == i)
						arrRow[i] = arrRow[i] + arr[i][j];
				}
				
				for(int k = 0; k < col; k++) {
				
					if(k == j)
						arrCol[j] = arrCol[j] + arr[i][j];
				}
			}
		}
		
		for(int k = 0; k < row; k++) {
				
			System.out.println("Sum of Row "+k+" = "+arrRow[k]);
		}
		
		for(int k = 0; k < col; k++) {
				
			System.out.println("Sum of Column "+k+" = "+arrCol[k]);
		}
	}
}
