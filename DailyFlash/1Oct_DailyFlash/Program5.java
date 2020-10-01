import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of integer array: ");
		int num = Integer.parseInt(br.readLine());

		int[] arr1 = new int[num];
		int[] arr2 = new int[num];

		System.out.println("Enter array elements: ");
		for(int i = 0; i < num; i++) {
		
			arr1[i] = Integer.parseInt(br.readLine());

			if(arr1[i] % 2 == 0)
				arr2[i] = -1;
		}

		System.out.println("Array 1: ");
		for(int i = 0; i < num; i++) {
		
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		
		System.out.println("Array 2: ");
		for(int i = 0; i < num; i++) {
		
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
	}
}
