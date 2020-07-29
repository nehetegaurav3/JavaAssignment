class Program4 {

	public static void main(String[] args) {
	
		int a = 25,b = -34, c = 19, d = 4;

		int res = (a << 2 | b >> 3);
		System.out.println(res);

		boolean result = ((a << 2 | b >> 3) < -10) || ((c++ << 2 & b-- >>> d) >= 23);
		System.out.println(result);
	} 
}
