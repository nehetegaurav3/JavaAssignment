import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("1. Integer Input");
		System.out.println("2. String Input");
		System.out.print("Enter Your Choice: ");

		int ch = Integer.parseInt(br.readLine());

		switch(ch) {
		
			case 1:
				System.out.print("Enter Integer Input: ");
				int intIP = Integer.parseInt(br.readLine());
				System.out.println("Your Input: "+intIP);
				break;
			case 2:
				System.out.print("Enter String Input: ");
				String strIP = br.readLine();
				System.out.println("Your Input: "+strIP);
				break;
			default:
				System.out.println("Invalid Input...!");
				break;
		}
	}
}
