import java.io.*;


class Program5 {

	public static void main(String[] args) throws IOException {
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("-----Enter Date(DD), Month(MM), Year(YYYY) One after Another-----");
		System.out.print("Enter Date (DD) : ");
		int dd = Integer.parseInt(br.readLine());
		System.out.print("Enter Month (MM) : ");
		int mm = Integer.parseInt(br.readLine());
		System.out.print("Enter Year (YYYY) : ");
		int yyyy = Integer.parseInt(br.readLine());

		if(mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
		
			if(dd >= 1 && dd <= 31)
				System.out.println(dd+"/"+mm+"/"+yyyy+" is a Valid Date.");
			else
				System.out.println(dd+"/"+mm+"/"+yyyy+" is an Invalid Date.");
		
		} else if(mm == 4 || mm == 6 || mm == 9 || mm == 11) {
		
			if(dd >= 1 && dd <= 30)
				System.out.println(dd+"/"+mm+"/"+yyyy+" is a Valid Date.");
			else
				System.out.println(dd+"/"+mm+"/"+yyyy+" is an Invalid Date.");
		
		} else if(mm == 2) {
		
			if(yyyy % 4 == 0 && (dd >= 1 && dd <= 29))
				System.out.println(dd+"/"+mm+"/"+yyyy+" is a Valid Date.");
			else if (dd >= 1 && dd <= 28)
				System.out.println(dd+"/"+mm+"/"+yyyy+" is a Valid Date.");
			else
				System.out.println(dd+"/"+mm+"/"+yyyy+" is an Invalid Date.");
		
		} else {
		
				System.out.println(dd+"/"+mm+"/"+yyyy+" is an Invalid Date.");
		}
	}
}
