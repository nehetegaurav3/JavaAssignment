

class Program4 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 4; i++) {
		
			int num = 4 - i;

			for(int j = 1; j <= i; j++) {
			
				System.out.print((num++)+" ");
			}
			System.out.println();
		}
	}
}
