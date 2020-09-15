

class Program4 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 5; i++) {
		
			for(int space = 1; space < i; space++) {
			
				System.out.print("  ");
			}

			for(int j = i; j <= 5; j++) {
			
				System.out.print((i*j)+" ");
			}
			System.out.println();
		}
	}
}
