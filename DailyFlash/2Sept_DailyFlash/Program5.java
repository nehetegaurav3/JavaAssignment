import java.io.*;


class Program5 {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.print("Enter First Number: ");
                int num1 = Integer.parseInt(br.readLine());
                System.out.print("Enter Second Number: ");
                int num2 = Integer.parseInt(br.readLine());
                System.out.print("Enter Third Number: ");
                int num3 = Integer.parseInt(br.readLine());

		if(num1 > num2 && num1 > num3)
			System.out.printf("The max. among %d, %d & %d is %d\n",num1,num2,num3,num1);
		else if(num2 > num1 && num2 > num3)
			System.out.printf("The max. among %d, %d & %d is %d\n",num1,num2,num3,num2);
		else
			System.out.printf("The max. among %d, %d & %d is %d\n",num1,num2,num3,num3);
        }
}
