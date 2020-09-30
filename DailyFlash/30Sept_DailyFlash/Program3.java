import java.io.*;


class Program3 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Number of Subjects: ");
		int num = Integer.parseInt(br.readLine());

		int[] stud = new int[num];

		int total = 0;

		System.out.println("Enter Marks of "+num+" Subjects: ");
		for(int i = 0; i < num; i++) {
		
			stud[i] = Integer.parseInt(br.readLine());
			total = total + stud[i];
		}
		
		double percent = (double)total / num;

		System.out.println("Total marks = "+total);
		System.out.println("Percentage = "+percent);
	}
}
