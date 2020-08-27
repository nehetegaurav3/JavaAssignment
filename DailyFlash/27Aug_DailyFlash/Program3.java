import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(br.readLine());
		
		int c1 = num1 * num1 * num1;
		int c2 = num2 * num2 * num2;
		System.out.println("Addition of cubes = "+(c1+c2));

		int s1 = num1 * num1;
		int s2 = num2 * num2;
		System.out.println("Substraction of squares = "+(s1-s2));
	}
}
