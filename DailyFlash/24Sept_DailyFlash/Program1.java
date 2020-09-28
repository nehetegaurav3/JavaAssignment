import java.io.*;
import java.util.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Student Name, Grade, Age and Marks: ");
		String StudInfo = br.readLine();

		StringTokenizer st = new StringTokenizer(StudInfo," ");

		String name = st.nextToken();
		char grade = st.nextToken().charAt(0);
		int age = Integer.parseInt(st.nextToken());
		double marks = Double.parseDouble(st.nextToken());

		System.out.println("Name: "+name);
		System.out.println("Grade: "+grade);
		System.out.println("Age: "+age);
		System.out.println("Marks: "+marks);
	}
}
