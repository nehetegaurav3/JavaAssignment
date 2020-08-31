import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		System.out.println("Perfect Divisors of "+num+":");
		
		for(int i = 2; i <= num; i++) {
		
			if(num % i == 0)
				System.out.print(i+"  ");
		}
		System.out.println();
	}
}
