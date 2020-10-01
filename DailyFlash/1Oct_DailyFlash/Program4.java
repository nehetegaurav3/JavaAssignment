import java.io.*;


class Program4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Number of Over = ");
		int over = Integer.parseInt(br.readLine());

		int ball = over * 6;

		int[] arr = new int[ball];

		int score = 0, six = 0, four = 0, dot = 0, other = 0;

		System.out.println("Enter ballwise data: ");
		for(int i = 0; i < ball; i++) {
		
			arr[i] = Integer.parseInt(br.readLine());

			score = score + arr[i];
			if(arr[i] == 6)
				six++;
			else if(arr[i] == 4)
				four++;
			else if(arr[i] == 0)
				dot++;
			else
				other++;
		}

		System.out.println("Score = "+score);
		System.out.println("Sixes = "+six);
		System.out.println("Fours = "+four);
		System.out.println("Dot Balls = "+dot);
		System.out.println("Others = "+other);
	}
}
