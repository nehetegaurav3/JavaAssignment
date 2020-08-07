

class Program2 {

	public static void main(String[] args) {
	
		int num = 12345;
		int evenSum = 0;
		int oddMult = 1;

		while(num != 0) {
		
			int rem = num % 10;

			if(rem % 2 == 0)
				evenSum = evenSum + rem;
			else
				oddMult = oddMult * rem;

			num = num / 10;	
		}

		System.out.println("Sum of Even Numbers = "+ evenSum);
		System.out.println("Multiplication of Odd Numbers = "+ oddMult);
	}
}
