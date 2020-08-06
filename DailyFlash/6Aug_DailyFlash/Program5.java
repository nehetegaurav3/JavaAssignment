
class Program5 {

	public static void main(String[] args) {
	
		int num = 3;

		System.out.println("Table of 3: ");
		for(int i = num; i >= (num * 10); i = i + num) {
		
			System.out.print(i + "  ");
		}

		System.out.println("Even Numbers: ");
		for(int i = num; i >= (num * 10); i = i + num) {
		
			if(i % 2 == 0)
				System.out.print(i + "  ");
		}
	}
}
