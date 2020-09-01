import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num; i++) {
		
			if(i % 2 == 0)
				System.out.printf("Cube of %d = %d & Square of %d = %d\n",i,i*i*i,i,i*i);
		}
	}
}
