

class Program6 {

	public static void main(String[] args) {
	
		int num = 6;
		int add = 0;

		for(int i = 1; i < num; i++) {
		
			if (num % i == 0)
				add = add + i;
		}

		if(add == num)
			System.out.println("Number "+num+" is Perfect Number");
		else
			System.out.println("Nember "+num+" is not Perfect Number");
	}
}
