import java.io.*;


class InputDemo {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);
		
		System.out.print("Enter Number 1:");
		
		int input1 = Integer.parseInt(br.readLine());
		//Integer WrapperClass has parseInt() Method
		
		System.out.println(input1);
		
		System.out.print("Enter Number 2:");
		int input2 = Integer.parseInt(br.readLine());
		//Integer WrapperClass has parseInt() Method

		System.out.println(input2);
		System.out.println(input1+input2);
	}
}
/*	We use wrapper class because class cannot directly communicate with primitive datatype.
 *	So we use wrapper class for communication. Here input type is String which can't be 
 *	converted directly into integer datatype. So we use Integer Wrapper Class which has
 *	parseInt() Method.
*/
