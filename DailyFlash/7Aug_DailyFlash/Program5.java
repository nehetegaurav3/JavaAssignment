

class Program5 {

	public static void main(String[] args) {
	
		int num = 12345;
		int sum = 0, cnt = 0;
		int avg;

		while(num != 0) {
		
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
			cnt++;
		}

		avg = sum/cnt;
		
		System.out.println("Average of Digits = "+ avg);
	}
}
