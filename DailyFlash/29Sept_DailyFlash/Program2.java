/*	create an hard coded integer array of size 5 and print the numbers from array which are even.	*/


class Program2 {

	public static void main(String[] args) {
	
		int arr[] = {11,22,44,55,76};

		for(int i = 0; i < 5; i++) {
		
			if(arr[i] % 2 == 0)
				System.out.println("Even Number: "+arr[i]);
		}
	}
}
