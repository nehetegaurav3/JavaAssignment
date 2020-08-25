import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException{
	
	int cnt = 1;
	int sum = 0;
	int num;

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);

	while(cnt <= 10) {
		
		System.out.print("Enter Number : ");
		String s = br.readLine();
	
		System.out.print("Enter Number : ");
		num = Integer.parseInt(s);
		sum = sum + num;
		cnt++;
	}

	float avg = sum / 10;
	System.out.println("Sum of Numbers = "+sum);
	System.out.println("Average of Numbers = "+avg);
}
