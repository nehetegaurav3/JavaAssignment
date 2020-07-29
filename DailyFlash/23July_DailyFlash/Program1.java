
class Program1 {

	int EvenOdd(int a) {
	
		if(a % 2 == 0) {
			System.out.println("If Condition true");
			return 0;
		}
		else {
			System.out.println("If Condition false");
			return 1;
		}
	}

	public static void main(String[] args) {

		Program1 obj = new Program1();	
		
		int result = obj.EvenOdd(12);

		if(result == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
	}
}
