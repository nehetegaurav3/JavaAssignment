

class Program3 {

	public static void main(String[] args) {
	
		int num = 20;
		int primeNo = 2;
		int cnt = 0;

		System.out.print("2  ");
		
		while(num >= primeNo) {
		
			for(int i = 2; i <= primeNo; i++) {
			
				if(primeNo % i == 0) {
					
					break;
				}else {
					
					System.out.print(primeNo +"  ");
					break;
				}
			}
			primeNo++;
		}
		System.out.println("");
	}
}
