import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader brOne = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader brTwo = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Name: ");
		String name = brOne.readLine();
		
		System.out.print("Enter Surname: ");
		String surname = brTwo.readLine();

		System.out.println("Name is: "+name+" "+surname);

		brOne.close();
		brTwo.close();
	}
}
