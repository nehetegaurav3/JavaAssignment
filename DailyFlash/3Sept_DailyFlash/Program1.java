import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int sum = 0;
	
		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i < num; i++) {

			if(num % i == 0)
				sum = sum + i;
		}

		if(num == sum)
			System.out.println(num+" is Perfect Number");
		else
			System.out.println(num+" is not Perfect Number");
	}
}
