import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter 1st Number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter 2nd Number: ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.print("Enter 3rd Number: ");
		int num3 = Integer.parseInt(br.readLine());

		if(num1 < num2 && num1 < num3)
			System.out.printf("%d is minimum among %d, %d & %d\n",num1,num1,num2,num3);
		else if(num2 < num1 && num2 < num3)
			System.out.printf("%d is minimum among %d, %d & %d\n",num2,num1,num2,num3);
		else
			System.out.printf("%d is minimum among %d, %d & %d\n",num3,num1,num2,num3);
	}
}
