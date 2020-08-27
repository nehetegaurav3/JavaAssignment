import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.print("Enter operator (+,-,*,/): ");
		char ch = (char)br.read();

		int res = 0;
		switch(ch) {
		
			case '+':
				res = num1 + num2;
				System.out.println("Addition = "+res);
				break;
			case '-':
				res = num1 - num2;
				System.out.println("Substraction = "+res);
				break;
			case '*':
				res = num1 * num2;
				System.out.println("Multiplication = "+res);
				break;
			case '/':
				res = num1 / num2;
				System.out.println("Division = "+res);
				break;
			default:
				System.out.println("Enter Valid Operator...!!!");
				break;
		}
	}
}
