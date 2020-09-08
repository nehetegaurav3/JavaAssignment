import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Amount in Rupees: ");
		double rupee = Double.parseDouble(br.readLine());

		double dollar = rupee * 0.013556;

		System.out.println("Amount in Dollar = "+dollar);
	}
}
