import java.io.*;


class Program2 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number : ");
		String s = br.readLine();
		int num = Integer.parseInt(s);
		
		int sum = 0;

		for(int i = 1; i <= num; i++) {
		
			sum = sum + i;
		}

		System.out.println("Sum of all numbers upto "+num+" = "+sum);
	}
}
