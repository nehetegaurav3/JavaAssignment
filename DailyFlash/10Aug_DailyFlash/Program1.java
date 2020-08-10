

class Program1 {

	public static void main(String[] args) {
	
		int num = 1;

		while(num <= 50) {
		
			if(num % 2 == 1)
				System.out.println("Cube of "+ num + ": " + num*num*num);

			num++;
		}
	}
}
