

class Program10 {

	public static void main(String[] args) {
	
		int num = 10;
		int pow = 2;
		int output = 1;

		for(int i = 1; i <= pow; i++) {
		
			output = output * num;
		}

		System.out.println(num+" to the power "+pow+" is "+output);
	}
}
