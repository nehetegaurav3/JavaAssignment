

class Program9 {

	public static void main(String[] args) {
	
		int num = 121;
		int palnum = 0;
		int tempnum = num;

		while(num != 0) {
		
			int rem = num % 10;
			palnum = (palnum * 10) + rem;
			num = num / 10;
		}

		if(tempnum == palnum)
			System.out.println("Number "+palnum+" is Palindrome");
		else
			System.out.println("Number "+palnum+" is not Palindrome");
	}
}
