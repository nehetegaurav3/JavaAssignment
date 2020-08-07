

class Program1 {

	public static void main(String[] args) {
	
		int num = 12345678, cnt = 0;

		while(num != 0) {
		
			num = num/10;
			cnt++;
		}

		System.out.println(cnt);
	}
}
