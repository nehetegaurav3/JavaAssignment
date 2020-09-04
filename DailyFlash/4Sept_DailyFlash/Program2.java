import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		System.out.println("Second Predecessor = "+(num-2));
		System.out.println("Second Successor = "+(num+2));
	}
}
