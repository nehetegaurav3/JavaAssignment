


class NestedForDemo {

	public static void main(String[] args) {
	
		int num = 1;

		for(int i = 1; i <= 4; i++) {
		
			for(int j = 4; j >= i; j--) {
			
				if(j == 4 || j == 2) {
				
					System.out.print(num+" ");
				} else {
				
					System.out.print("* ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
