/*	take an array element {A,B,C,D,E} and convert into lower case letter and print it.	*/

class Program5 {

	public static void main(String[] args) {
	
		char arr[] = {'A','B','C','D','E'};

		for(int i = 0; i < 5; i++) {
		
			int a = (int)(arr[i]);
			a = a + 32;
			arr[i] = (char)a;
		}

		System.out.println("Array in lower case: ");

		for(int i = 0; i < 5; i++) {
		
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
