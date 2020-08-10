

class Program2 {

	public static void main(String[] args) {
	
		int num1 = 1;
		int num2 = 10;

		while(num1 <= 10) {
		
			int ans = num1 + num2;	
			System.out.println(num1 +" + "+ num2 +" = "+ ans);
			num1++;
			num2--;
		}
	}
}
