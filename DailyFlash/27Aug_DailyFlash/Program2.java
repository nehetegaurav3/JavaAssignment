import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());
		
		int mult = num1 * num2;
		System.out.println("Multiplication = "+mult);

		if(num1 > num2) {
		
			int div = num1 / num2;
			System.out.println("Division = "+div);
		} else {
			int div = num2 / num1;
			System.out.println("Division = "+div);
		}
	}
}
