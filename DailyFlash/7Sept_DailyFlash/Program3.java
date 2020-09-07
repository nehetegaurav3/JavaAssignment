import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Dividend Number: ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Divisor Number: ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Quotient = "+(num1/num2));
		System.out.println("Remainder = "+(num1%num2));
	}
}
