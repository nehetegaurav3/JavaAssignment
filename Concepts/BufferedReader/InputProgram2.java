
import java.io.*;

class InputProgram {

	public static void main(String[] args) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int input = br.read();
		System.out.println(input);
	}
}
