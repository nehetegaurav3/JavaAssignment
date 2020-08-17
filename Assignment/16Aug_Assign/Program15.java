

class Program15 {

	public static void main(String[] args) {
		
		int num = 123;
	 	int cnt = 0;

	 	while(num != 0) {
	 
	 		if(num % 2 == 0)
				num = num / 2;
			else
				num = num - 1;

			cnt++;
	 	}

	 	System.out.println("Steps required to reduce to 0 = "+cnt);
	}
}
