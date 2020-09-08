import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter Number: ");
		int num = Integer.parseInt(br.readLine());

		for(int i = 1; i <= num; i++) {
		
			int per = 1, j = 2;
			while(j < i) {
			
				if(i % j == 0)
					per = per + j;
				j++;
			}
			if(per == i)
				System.out.print(i+" ");
		}
		System.out.println();
	}
}
