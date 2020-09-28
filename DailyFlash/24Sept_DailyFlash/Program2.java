import java.io.*;
import java.util.*;


class Program2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Student 1 Name, Grade, Age & Marks(Seprated by ','): ");

		String stud1 = br.readLine();

		System.out.println("Enter Student 2 Name, Grade, Age & Marks(Seprated by ','): ");

		String stud2 = br.readLine();

		StringTokenizer st1 = new StringTokenizer(stud1,",");
		
		String name1 = (st1.nextToken()).trim();
		char grade1 = (st1.nextToken()).trim().charAt(0);
		int age1 = Integer.parseInt(st1.nextToken().trim());
		double marks1 = Double.parseDouble(st1.nextToken().trim());
		
		StringTokenizer st2 = new StringTokenizer(stud2,",");
		
		String name2 = (st2.nextToken()).trim();
		char grade2 = (st2.nextToken()).trim().charAt(0);
		int age2 = Integer.parseInt(st2.nextToken().trim());
		double marks2 = Double.parseDouble(st2.nextToken().trim());

		System.out.println("Student 1 Details: ");
		System.out.println("Student 1 Name = "+name1);
		System.out.println("Student 1 Grade = "+grade1);
		System.out.println("Student 1 Age = "+age1);
		System.out.println("Student 1 Marks = "+marks1);
		
		System.out.println("Student 2 Details: ");
		System.out.println("Student 2 Name = "+name2);
		System.out.println("Student 2 Grade = "+grade2);
		System.out.println("Student 2 Age = "+age2);
		System.out.println("Student 2 Marks = "+marks2);
	}
}
