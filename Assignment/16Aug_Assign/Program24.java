

class Program24 {

	public static void main(String[] args) {
	
		int num = 12321;
		int cnt = 0;

		while(num != 0) {
		
			num = num / 10;
			cnt++;
		}

		System.out.println("Number of digits in number is "+cnt);
	}
}
