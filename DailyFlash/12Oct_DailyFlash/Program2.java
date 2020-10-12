import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter String 1: ");
		String s1 = br.readLine();
		System.out.print("Enter String 2: ");
		String s2 = new String(br.readLine());

		System.out.println(s1+"\""+s2);
	}
}
