import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter first Number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second Number: ");
		int num2 = Integer.parseInt(br.readLine());

		if(num1 > num2)
			System.out.println(num1+" is maximum amongst "+num1+" & "+num2);
		else
			System.out.println(num2+" is maximum amongst "+num1+" & "+num2);
	}
}
