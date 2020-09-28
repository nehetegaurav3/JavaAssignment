import java.io.*;
import java.util.*;

class Program3 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 1; i <= 3; i++) {

			System.out.println("Enter Details of Student"+i+" :");
			System.out.print("Name Grade Age Marks : ");

			String str = br.readLine();

			StringTokenizer st = new StringTokenizer(str," ");

			String name = st.nextToken();
			char grade = st.nextToken().charAt(0);
			int age = Integer.parseInt(st.nextToken());
			float marks = Float.parseFloat(st.nextToken());

			System.out.println("\nName : "+name);
			System.out.println("Grade : "+grade);
			System.out.println("Age : "+age);
			System.out.println("Marks : "+marks);

			System.out.println();
		}	

	}
}
