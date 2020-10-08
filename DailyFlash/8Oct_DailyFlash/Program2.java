import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Number of Rows: ");
		int row = Integer.parseInt(br.readLine());

		int[][] arr = new int[row][];

		for(int i = 0; i < row; i++) {
		
			arr[i] = new int[i+1];
		}

		System.out.println("Enter Input: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = Integer.parseInt(br.readLine());
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
