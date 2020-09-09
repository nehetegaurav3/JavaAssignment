import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter First Number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.print("Enter Second Number: ");
		int num2 = Integer.parseInt(br.readLine());

		int GCD = 0;

		if(num1 > num2) {
		
			for(int i = 1; i <= num2; i++) {
			
				if(num1 % i == 0 && num2 % i == 0)
					GCD = i;
			}
		}else {
		
			for(int i = 1; i <= num1; i++) {
			
				if(num1 % i == 0 && num2 % i == 0)
					GCD = i;
			}
		}

		System.out.println("GCD of "+num1+" & "+num2+" = "+GCD);
	}
}
