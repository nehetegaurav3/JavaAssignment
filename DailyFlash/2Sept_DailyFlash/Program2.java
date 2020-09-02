import java.io.*;


class Program2 {

        public static void main(String[] args) throws IOException {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.print("Enter First Number: ");
                int num1 = Integer.parseInt(br.readLine());
                System.out.print("Enter Second Number: ");
                int num2 = Integer.parseInt(br.readLine());

		if(num1 < num2)
			System.out.println(num1+" is Smaller among "+num1+" & "+num2);
		else
			System.out.println(num2+" is Smaller among "+num1+" & "+num2);
	}
}
