import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0, sum = 0;

		System.out.println("Keep Entering Numbers: ");

		while(num <= 50) {
		
			num = Integer.parseInt(br.readLine());

			sum = sum + num;
		}
		
		System.out.println("Sum = "+sum);
	}
}
