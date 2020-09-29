/*	store the score of cricket players in an integer array and print the total score of team.	*/
import java.io.*;


class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[11];
		int sum = 0;

		for(int i = 0; i < 11; i++) {
		
			System.out.print("Enter Score of Player "+(i+1)+" : ");
			arr[i] = Integer.parseInt(br.readLine());
			sum = sum + arr[i];
		}

		System.out.println("Score of team = "+sum);
	}
}
