import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Min. Number of Series: ");
		int min = Integer.parseInt(br.readLine());
		System.out.print("Max. Number of Series: ");
		int max = Integer.parseInt(br.readLine());

		for(int i = min; i <= max; i++) {
		
			if(i % 2 == 1)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
