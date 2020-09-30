import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num, max = 0, cnt = 0;

		System.out.print("Enter number of Students: ");
		num = Integer.parseInt(br.readLine());

		int[] stud = new int[num];

		System.out.println("Enter Student's Age: ");
		for(int i = 0; i < num; i++) {
		
			stud[i] = Integer.parseInt(br.readLine());
			if(stud[i] > max)
				max = stud[i];
		}

		for(int i = 0; i < num; i++) {
		
			if(stud[i] == max)
				break;
			else
				cnt++;
		}

		System.out.println("Maximum age of student = "+max);
		System.out.println("Index location of maximum age = "+cnt);
	}
}
