

class Program18 {

	public static void main(String[] args) {
	
		int num = 420;

		while(num != 0) {
		
			int rem = num % 10;
			System.out.print(rem);
			num = num / 10;
		}
		System.out.println();
	}
}
