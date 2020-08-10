

class Program4 {

	public static void main(String[] args) {
	
		int n = 10;
		for(int num = 1; num <= n; num++) {
	
			
			int fact = 1;
			int temp = 1;

			while(temp <= num) {
		
				fact = fact * temp;
				temp++;
			}

			System.out.println("Factorial of "+ num +": "+ fact);
		}
	} 
}
