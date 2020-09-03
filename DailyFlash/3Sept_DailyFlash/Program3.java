import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Current in Circuit: ");
		int I = Integer.parseInt(br.readLine());
		System.out.print("Enter Resistance in Circuit: ");
		int R = Integer.parseInt(br.readLine());

		int V = I * R;

		System.out.println("Voltage across Circuit = "+V);
	}
}
