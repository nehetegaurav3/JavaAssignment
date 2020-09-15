

class Program1 {

	public static void main(String[] args) {
	
		char ch = 'A';

		for(int i = 1; i <= 5; i++) {

			for(int space = 4; space >= i; space--) {
			
				System.out.print("  ");
			}
			
			char ch1 = ch;
			for(int j = 1; j <= i; j++) {
			
				System.out.print(ch1+" ");
				ch1++;
			}
			ch++;
			System.out.println();
		}
	}
}
