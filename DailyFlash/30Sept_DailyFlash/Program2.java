

class Program2 {

	public static void main(String[] args) {
	
		int my_array[] = {25,14,56,15,36,56,77,18,29,49};

		int cnt = 0;

		for(int i = 0; i < 10; i++) {
		
			if(my_array[i] == 25)
				System.out.println(my_array[i]+" is at "+cnt+" position");
			cnt++;
		}
		
		cnt = 0;

		for(int i = 0; i < 10; i++) {
		
			if(my_array[i] == 77)
				System.out.println(my_array[i]+" is at "+cnt+" position");
			cnt++;
		}
	}
}
