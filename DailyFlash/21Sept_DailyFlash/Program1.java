

class Program1 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 3; i++) {
		
			for(int space = 1; space <= i - 1; space++) {
			
				System.out.print("  ");
			}
			for(int j = 1; j <= 3; j++) {
			
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
