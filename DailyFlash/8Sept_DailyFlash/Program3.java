

class Program3 {

	public static void main(String[] args) {
	
		int ch = 'A';
		for(int i = 1; i <= 5; i++) {
		
			for(int j = 5; j >= i; j--) {
			
				System.out.printf("%c ",ch);
			}
			ch++;
			System.out.println();
		}
	}
}
