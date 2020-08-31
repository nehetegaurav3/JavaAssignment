import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		int fact = 1;

		for(int i = 1; i <= num; i++) {
		
			fact = fact * i;
		}
		System.out.println("Factorial of "+num+" = "+fact);
	}
}
