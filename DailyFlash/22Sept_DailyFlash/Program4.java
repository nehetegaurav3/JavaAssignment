

class Program4 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 4; i++) {
		
			for(int space = 3; space >= i; space--) {
			
				System.out.print(" ");
			}

			for(int j = 1; j <= 2; j++) {
		
				if(i == 1)
					j++;
				if(i >= 2 && j >= 2) {
				
					if(i == 2)
						System.out.print(" ");	
					else if(i == 3)
						System.out.print("   ");	
					else if(i == 4)
						System.out.print("     ");	
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
