

class Program1 {

	public static void main(String[] args) {
	
		System.out.println("Numbers divisible by 3 or 5: ");

		for(int num = 1; num <= 100; num++) {
		
			if(num % 3 == 0 || num % 5 == 0)
				System.out.print(num+"  ");
		}
		System.out.println();
	}
}
