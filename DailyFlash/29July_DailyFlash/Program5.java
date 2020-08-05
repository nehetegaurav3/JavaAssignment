

class EvenOdd {

	static boolean isEven(int num,int x) {
	
		if ((num & ((1 << x) - 1)) == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
		int num = 100;
		
		if (isEven(num,2))
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
