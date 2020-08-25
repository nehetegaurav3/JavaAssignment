import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number : ");
		String s = br.readLine();
		int num = Integer.parseInt(s);

		if(num % 2 == 0)
			System.out.println(num+" is Even Number");
		else
			System.out.println(num+" is Odd Number");
	}
}
