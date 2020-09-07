import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter Number 1:- ");
		System.out.print("Real Part: ");
		int a1 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary Part: ");
		int b1 = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Number 2:- ");
		System.out.print("Real Part: ");
		int a2 = Integer.parseInt(br.readLine());
		System.out.print("Imaginary Part: ");
		int b2 = Integer.parseInt(br.readLine());

		System.out.printf("\nSum of %d+%di & %d+%di = %d+%di\n",a1,b1,a2,b2,(a1+a2),(b1+b2));

	}
}
