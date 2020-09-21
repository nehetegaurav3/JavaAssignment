import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Year: ");
		int year = Integer.parseInt(br.readLine());

		if(year % 4 == 0)
			System.out.println(year+" is a Leap Year");
		else
			System.out.println(year+" is not a Leap Year");
	}
}
