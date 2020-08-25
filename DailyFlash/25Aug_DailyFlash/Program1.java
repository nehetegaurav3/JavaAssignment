import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number : ");
		String s = br.readLine();
		int num = Integer.parseInt(s);
		System.out.println("Output = "+num);
	}
}
