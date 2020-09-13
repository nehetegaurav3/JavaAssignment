

class NestedForDemo {

	public static void main(String[] args) {

		for(int i = 1; i <= 4; i++) {
		
			int num = 4;
			for(int j = 4; j >= i; j--) {
			
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
	}
}
