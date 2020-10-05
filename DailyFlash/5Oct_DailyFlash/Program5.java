import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Number of ELements: ");
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Original Array elements: ");
		for(int i = 0; i < num; i++) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int i = 0; i < num/2; i++) {
		
			int temp = arr[i];
			arr[i] = arr[(num - 1) - i];
			arr[(num - 1) - i] = temp;
		}

		System.out.println("Array Reversed: ");
		for(int i = 0; i < num; i++) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
