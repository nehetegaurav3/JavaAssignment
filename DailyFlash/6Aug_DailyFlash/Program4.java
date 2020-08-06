
class Program4 {

	public static void main(String[] args) {
	
		int num = 100;

		System.out.println("Reverse Order: ");
		
		for(int i = num; i >= 1; i--) {
		
			System.out.print(i +"  ");
		}
		System.out.println("");

		System.out.println("Number Divisible by 5: ");

		for(int i = num; i >= 1; i--) {
	
			if(i % 5 == 0)	
				System.out.print(i + "  ");
		}
		System.out.println("");
	}
}
