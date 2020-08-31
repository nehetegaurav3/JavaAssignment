

class Program2 {

	public static void main(String[] args) {
	
		System.out.println("Numbers divisible by 4 and 7: ");

		for(int num = 1; num <= 100; num++) {
		
			if(num % 4 == 0 && num % 7 == 0)
				System.out.print(num+"  ");
		}
		System.out.println();
	}
}
