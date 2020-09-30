import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 10 Integers: ");

		int[] arr = new int[10];
		int poscnt = 0, negcnt = 0, oddcnt = 0, evencnt = 0, zcnt = 0;

		for(int i = 0; i < 10; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i] > 0)
				poscnt++;
			if(arr[i] < 0)
				negcnt++;
			if(arr[i] % 2 == 1)
				oddcnt++;
			if(arr[i] % 2 == 0)
				evencnt++;
			if(arr[i] == 0)
				zcnt++;
		}

		System.out.println("Count of positive numbers = "+poscnt);
		System.out.println("Count of negative numbers = "+negcnt);
		System.out.println("Count of odd numbers = "+oddcnt);
		System.out.println("Count of even numbers = "+evencnt);
		System.out.println("Count of zero's = "+zcnt);
	}
}
