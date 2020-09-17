/*
 *	1 1 1 1 1
 *	2 2 
 *	3 3 
 *	4 4 
 *	5 5 5 5 5 
*/


class Program3 {

	public static void main(String[] args) {
	
		for(int i = 1; i <= 5; i++) {
		
			for(int j = 1; j <= 5; j++) {
			
				if((i > 1 && i < 5))
					if(j > 2)
						break;
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
