import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 1st Number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter 2nd Number: ");
		int num2 = Integer.parseInt(br.readLine());

		for(int i = num1; i <= num2; i++) {
	
			int fact = 1;
			for(int j = 1; j <= i; j++) {
		
				fact = fact * j;
			}

			System.out.printf("Factorial of %d = %d\n",i,fact);
		}
	}
}
