

class Program5 {

	public static void main(String[] args) {
	
		int count = 0;
		for(int i = 1; i <= 5; i++) {
		
			int num = 1 + count;

			for(int j = 5; j >= i; j--) {
			
				System.out.print(num+" ");
				num++;
			}
			count = count + 2;
			System.out.println();
		}
	}
}
