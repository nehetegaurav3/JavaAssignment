

class Divisibility {

	static boolean isDivisible(int dividend,int divisor) {
	
		if ((dividend & ((1 << divisor) - 1)) == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
		int dividend = 8, divisor = 2;
		
		if (isDivisible(dividend,divisor))
			System.out.println("Divisible by 2");
		else
			System.out.println("Not Divisible by 2");
	}
}
