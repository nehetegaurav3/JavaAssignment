import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		while(num >= 0) {
		
			if(num % 2 == 0)
				System.out.print(num+" ");
			num--;
		}
		System.out.println();
	}
}
