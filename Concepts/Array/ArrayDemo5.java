import java.io.*;


class ArrayDemo {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of Array: ");
		int x = Integer.parseInt(br.readLine());
		
		int[] arr = new int[x];

		System.out.println("User Input: ");
		for(int i = 0; i < x; i++) {		//x can be replaced by arr.length
							//length is method of Object class
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array is: ");
		for(int i = 0; i < arr.length; i++) {
		
			System.out.println((arr[i]));
		}
	}
}
