import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of array: ");
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];
		int sum = 0;

		System.out.println("Enter array elements: ");
		for(int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}

		System.out.println("Sum of array elements = "+sum);
	}
}
