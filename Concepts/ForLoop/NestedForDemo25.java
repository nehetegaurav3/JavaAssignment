

class NestedForDemo {

	public static void main(String[] args) {
	
		for(int row = 1; row <= 4; row++) {
		
			for(int space = 3; space >= row; space--) {
			
				System.out.print("  ");
			}

			int num = 1;

			for(int col = 1; col <= (row * 2 - 1); col++) {
			
				System.out.print(num+" ");
				
				if(col >= row)
					num--;
				else
					num++;
			}
			System.out.println();
		}
	}
}
