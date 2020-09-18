import java.io.*;


class InputDemo {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(isr);

		String input1 = br.readLine();

		System.out.println(input1);
		
		String input2 = br.readLine();

		System.out.println(input2);
	
		isr.close();

		br.readLine();			//IOException
	}
}

/*
Output:-

gaurav
gaurav
shashi
shashi
Exception in thread "main" java.io.IOException: Stream closed
	at sun.nio.cs.StreamDecoder.ensureOpen(StreamDecoder.java:46)		//Stacktrace
	at sun.nio.cs.StreamDecoder.read(StreamDecoder.java:148)
	at java.io.InputStreamReader.read(InputStreamReader.java:184)
	at java.io.BufferedReader.fill(BufferedReader.java:161)
	at java.io.BufferedReader.readLine(BufferedReader.java:324)
	at java.io.BufferedReader.readLine(BufferedReader.java:389)
	at InputDemo.main(InputDemo3.java:22)
*/
