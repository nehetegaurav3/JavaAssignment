

class Program2 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 5; i++) {
		
			for(int space = 4; space >= i; space--) {
			
				System.out.print("  ");
			}
			
			for(int j = 1; j <= i; j++) {
			
				if(j % 2 == 1)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
