import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Length of Rectangle : ");
		int length = Integer.parseInt(br.readLine());
		System.out.print("Enter Breadth of Rectangle : ");
		int breadth = Integer.parseInt(br.readLine());
		
		System.out.println("Area of Rectangle = "+(length*breadth)+" sq. unit");
	}
}
