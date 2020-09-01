import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter first Number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second Number: ");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("Before Swap: "+num1+" "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swap: "+num1+" "+num2);
	}
}
