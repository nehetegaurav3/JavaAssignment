

class Program3 {

	public static void main(String[] args) {
	
		long num = 566970562;
		int digit = 6;
		int cnt = 0;
		long tempnum = num;

		while(num != 0) {
		
			long rem = num % 10;

			if(rem == digit)
				cnt++;

			num = num / 10;
		}

		System.out.println("Occurence of "+digit+" in "+tempnum+" = "+cnt);
	}
}
