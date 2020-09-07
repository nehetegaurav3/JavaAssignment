import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Mass of Body (in kgs): ");
		double mass = Double.parseDouble(br.readLine());
		System.out.print("Enter Velocity of Body (in m/s): ");
		double vel = Double.parseDouble(br.readLine());

		double KE = 0.5 * mass * vel * vel;

		System.out.println("Kinetic Energy of Body = "+KE+" J");
	}
}
