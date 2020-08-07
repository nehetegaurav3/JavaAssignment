

class Program4 {

	public static void main(String[] args) {
	
		int num = 12357798;
		int res = 0;

		while(num != 0) {
		
			int rem = num % 10;

			if(res <= rem)
				res = rem;

			num = num / 10;
		}

		System.out.println("Maximum Digit from Output = "+ res);
	}
}
