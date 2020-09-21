import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter First Number: ");
		int num1 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Second Number: ");
		int num2 = Integer.parseInt(br.readLine());
		
		System.out.print("Enter Third Number: ");
		int num3 = Integer.parseInt(br.readLine());

		if(num1 > num2 && num1 > num3)
			System.out.printf("%d is largest among %d, %d & %d\n",num1,num1,num2,num3);
		else if(num2 > num1 && num2 > num3)
			System.out.printf("%d is largest among %d, %d & %d\n",num2,num1,num2,num3);
		else
			System.out.printf("%d is largest among %d, %d & %d\n",num3,num1,num2,num3);
	}
}
