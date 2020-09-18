import java.io.*;


class InputDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input1 = br.readLine();

		System.out.println(input1);
		
		String input2 = br.readLine();

		System.out.println(input2);
	
		br.close();

		br.readLine();			//IOException
	}
}

/*
Output:-

Gaurav
Gaurav
Shashi
Shashi
Exception in thread "main" java.io.IOException: Stream closed
	at java.io.BufferedReader.ensureOpen(BufferedReader.java:122)		//Stacktrace
	at java.io.BufferedReader.readLine(BufferedReader.java:317)		//Stacktrace
	at java.io.BufferedReader.readLine(BufferedReader.java:389)		//Stacktrace
	at InputDemo.main(InputDemo2.java:20)					//Stacktrace
*/
