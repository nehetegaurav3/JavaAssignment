import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Rows: ");
		int row = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Columns: ");
		int col = Integer.parseInt(br.readLine());

		int[][] arr = new int[row][col];

		int evenSum = 0;
		int maxOdd = 0;

		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < col; j++) {
			
				arr[i][j] = Integer.parseInt(br.readLine());
				if(arr[i][j] % 2 == 0)
					evenSum = evenSum + arr[i][j];
				else if(arr[i][j] % 2 == 1)
					if(maxOdd < arr[i][j])
						maxOdd = arr[i][j];
			}
		}

		System.out.println("Sum of Even Elements = "+evenSum);
		System.out.println("Maximum of Odd Elements = "+maxOdd);
		System.out.println("Multiplication of Both = "+(evenSum * maxOdd));
	}
}
