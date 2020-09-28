import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Name: ");
		String name = br.readLine();
		System.out.print("Enter Roll No.: ");
		int rollNo = Integer.parseInt(br.readLine());
		System.out.print("Enter Field of Interest: ");
		String FoI = br.readLine();

		System.out.print("Hey my name is "+name+" ");
		System.out.print("and my roll number is "+rollNo+". ");
		System.out.print("My field of interest is "+FoI+". \n");
	}
}
