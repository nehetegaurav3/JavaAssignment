

class Program4 {

	public static void main(String[] args) {
	
		int num = 1;

		for(int i = 1; i <= 4; i++) {
	
			for(int j = 1; j <= i; j++) {
		
				if((num*num*num) < 10) {

					System.out.print((num*num*num)+"   ");
					num++;
				} else if((num*num*num) >= 10 && (num*num*num) < 100) {
			
					System.out.print((num*num*num)+"  ");
					num++;
				} else {
			
					System.out.print((num*num*num)+" ");
					num++;
				}
			}
			System.out.println();
		}
	}
}
