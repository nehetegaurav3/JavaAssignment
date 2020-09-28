import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Length of Side of Square: ");
		int side = Integer.parseInt(br.readLine());

		System.out.println("Area of Square = "+(side*side)+" sq. unit");
		System.out.println("Perimeter of Square = "+(4*side)+" unit");
	}
}
