import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter String: ");
		String s1 = br.readLine();
		String s2 = "Fantastic";

		System.out.println(s1+"\'"+s2);
	}
}
