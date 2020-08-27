import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());

		if(num1 > num2) {
		
			int sub = num1 - num2;
			System.out.println("Substraction = "+sub);
		} else {
			int sub = num2 - num1;
			System.out.println("Substraction = "+sub);
		}
	}
}
