

class Program1 {

	public static void main(String[] args) {
	
		int my_array1[] = {1789,2035,1899,2013,1458,2458,1254,1472,2365};
		int flag = 0;

		for(int i = 0; i < 9; i++) {
		
			if(my_array1[i] == 2013)
				flag = 1;
		}

		if(flag == 1)
			System.out.println("Array contains 2013");
		else
			System.out.println("Array doesn't contains 2013");

		flag = 0;

		for(int i = 0; i < 9; i++) {
		
			if(my_array1[i] == 2015)
				flag = 1;
		}

		if(flag == 1)
			System.out.println("Array contains 2015");
		else
			System.out.println("Array doesn't contains 2015");
	}
}
