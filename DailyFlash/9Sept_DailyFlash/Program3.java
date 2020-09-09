import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Hour: ");
		int hr = Integer.parseInt(br.readLine());

		int sec = hr * 60 * 60;

		System.out.println(hr+" hour = "+sec+" second");
	}
}
