import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 10; i >= 1; i--) {
		
			System.out.println(num+" X "+i+" = "+(num*i));
		}
	}
}
