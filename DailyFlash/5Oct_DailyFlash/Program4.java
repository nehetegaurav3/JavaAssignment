import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter number of elements: ");
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num + 1];

		System.out.println("Enter array elements:");
		for(int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Original Array:");
		for(int i = 0; i < num; i++) {
		
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("Enter Index to Insert New Element: ");
		int idx = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Element to Add: ");
		int newNum = Integer.parseInt(br.readLine());

		for(int i = num; i >= idx; i--) {
		
			arr[i] = arr[i - 1];	
		}

		arr[idx] = newNum;

		System.out.println("Updated Array: ");
		for(int i = 0; i <= num; i++) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
