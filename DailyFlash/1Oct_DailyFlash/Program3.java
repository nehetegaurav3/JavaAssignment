import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of array: ");
		int num = Integer.parseInt(br.readLine());

		int[] arr = new int[num];
		int max = 0;

		System.out.println("Enter array Elements: ");
		for(int i = 0; i < num; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max)
				max = arr[i];
		}

		System.out.println("Maximum Elements = "+max);
	}
}
