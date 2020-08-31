import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= num; i++) {
		
		if(i % 2 == 1)
			
			System.out.println("Cube of "+i+" = "+(i*i*i)+" & "+" Square of "+i+" = "+(i*i));
		}
	}
}
