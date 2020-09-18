import java.io.*;

class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Starting and Ending Limits: ");

		int first = Integer.parseInt(br.readLine());
		int last = Integer.parseInt(br.readLine());

		for(int i = first; i <= last; i++) {
		
			System.out.print((i*i*i)+" ");
		}
		System.out.println();
	}
}
