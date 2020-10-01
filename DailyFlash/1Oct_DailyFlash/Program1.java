import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of array: ");
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];

		System.out.println("Enter array elements:");
		for(int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Array in reverse: ");
		for(int i = num-1; i >= 0; i--) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
