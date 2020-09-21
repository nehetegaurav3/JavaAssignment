

class Program2 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 3; i++) {
		
			for(int space = 2; space >= i; space--) {
			
				System.out.print("  ");
			}
			for(int j = 1; j <= 3; j++) {
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
