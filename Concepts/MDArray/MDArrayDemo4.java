import java.io.*;


class MultiArrayDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no. of planes: ");
		int plane = Integer.parseInt(br.readLine());
		System.out.print("Enter no. of rows: ");
		int row = Integer.parseInt(br.readLine());
		System.out.print("Enter no. of columns: ");
		int col = Integer.parseInt(br.readLine());
		
		int arr[][][] = new int[plane][row][col];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < plane; i++) {
		
			for(int j = 0; j < row; j++) {
			
				for(int k = 0; k < col; k++) {
				
					arr[i][j][k] = Integer.parseInt(br.readLine());
				}
			}
		}
		
		System.out.println("Array elements: ");
		for(int i = 0; i < plane; i++) {
		
			System.out.println("For Plane "+(i+1)+" :");
			for(int j = 0; j < row; j++) {
			
				for(int k = 0; k < col; k++) {
				
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
