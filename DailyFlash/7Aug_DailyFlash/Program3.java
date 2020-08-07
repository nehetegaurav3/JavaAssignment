

class Program3 {

	public static void main(String[] args) {
	
		int i = 1;

		while(i <= 1000) {
		
			if(i % 32 == 0 && i % 7 == 0) {

				System.out.println(i);

				if(i % 6 == 0) {

					System.out.println("Breaking Loop");
					break;
				}
			}

			i++;
		}
	}
}
