/*	create an hard coded float array of size 5 and print the average of the element of the array.	*/


class Program3 {

	public static void main(String[] args) {
	
		float arr[] = {10.5f,20.5f,30.5f,40.5f,50.5f};

		float sum = 0;

		for(int i = 0; i < 5; i++) {
		
			sum = sum + arr[i];
		}

		System.out.println("Average of elements = "+(sum/5));
	}
}
