import java.lang.*;
import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First & Last Number: ");

		int first = Integer.parseInt(br.readLine());
		int last = Integer.parseInt(br.readLine());

		for(int i = first; i <= last; i++) {
		
			int fact = 1;

			for(int j = 1; j <= i; j++) {
			
				fact = fact * j;
			}
			System.out.println("Factorial of "+i+" = "+fact);
		}
	}
}
