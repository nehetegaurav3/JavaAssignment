

class WhileDemo {

	public static void main(String[] args) {
	
		int num = 135;
		int res = 0, rem = 0;

		while(num != 0) {
		
			rem = num % 10;
			res = res + rem;
			num = num/10;
		}

		System.out.println("Sum of Digits = "+ res);
	}
}
