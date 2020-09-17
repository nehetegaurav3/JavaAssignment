/*
 *	A B C D E F
 *	A B C D E
 *	A B C D
 *	A B C
 *	A B
 *	A
 *	A
 *	A B 
 *	A B C 
 *	A B C D
 *	A B C D E
 *	A B C D E F
*/


class Program5 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 5; i++) {
		
			char ch1 = 'A';

			for(int j = 5; j >= i; j--) {
			
				System.out.print(ch1+" ");
				ch1++;
			}
			System.out.println();
		}
		
		for(int i = 1; i <= 5; i++) {
		
			char ch2 = 'A';

			for(int j = 1; j <= i; j++) {
			
				System.out.print(ch2+" ");
				ch2++;
			}
			System.out.println();
		}
	}
}
