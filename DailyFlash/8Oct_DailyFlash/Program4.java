import java.util.*;


class Program4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rows: ");
		int row = sc.nextInt();

		int[][] arr = new int[row][];

		for(int i = 0; i < row; i++) {
		
			System.out.print("Number of elements in row "+(i+1)+": ");
			arr[i] = new int[sc.nextInt()];
		}

		System.out.println("Enter Input: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Even Numbers: ");
		for(int i = 0; i < row; i++) {
		
			for(int j = 0; j < arr[i].length; j++) {
			
				if(arr[i][j] % 2 == 0)
					System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
}
