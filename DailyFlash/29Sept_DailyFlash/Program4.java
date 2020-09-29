/*	take an array of elements {A,B,C,D,E} and print the following pattern
 *	A B C D E
 *	B C D E
 *	C D E
 *	D E
 *	E	*/


class Program4 {

	public static void main(String[] args) {
	
		char arr[] = {'A','B','C','D','E'};

		for(int i = 0; i < 5; i++) {
		
			int j = 0 + i;
			while(j < 5) {
			
				System.out.print(arr[j]+" ");
				j++;
			}
			System.out.println();
		}
	}
}
