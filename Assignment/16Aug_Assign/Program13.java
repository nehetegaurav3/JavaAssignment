

class Program13 {

	public static void main(String[] args) {
	
		int num = 9;
		int square = num*num;
		int sum = 0;

		while(square != 0) {
		
			int rem = square % 10;
			sum = sum + rem;
			square = square / 10;
		}

		if(num == sum)
			System.out.println(num+" is neon number");
		else
			System.out.println(num+" is not neon number");
	}
}
