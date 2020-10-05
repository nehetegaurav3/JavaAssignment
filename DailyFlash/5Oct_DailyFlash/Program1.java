import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of elements in both array: ");
		int num = Integer.parseInt(br.readLine());
		
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		int[] multArr = new int[num];

		System.out.println("Enter Array1 Elements: ");
		for(int i = 0; i < num; i++) {
		
			arr1[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Array2 Elements: ");
		for(int i = 0; i < num; i++) {
		
			arr2[i] = Integer.parseInt(br.readLine());
			multArr[i] = arr1[i] * arr2[i];
		}

		System.out.println("Multiplication of arrays: ");
		for(int i = 0; i < num; i++) {
		
			System.out.print(multArr[i]+" ");
		}
		System.out.println();
	}
}
