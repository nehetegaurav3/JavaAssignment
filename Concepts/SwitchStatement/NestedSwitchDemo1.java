

class mall {

	public static void main(String[] args) {
	
		int floor = 1;

		switch(floor) {
		
			case 1: {
			
				char ch = 'S';
				System.out.println("First Floor");

				switch(ch) {
				
					case 'S':
					case 's':
						System.out.println("Shopping");
						break;
					case 'F':
					case 'f':
						System.out.println("Nusta Foodie");
						break;
					default:
						System.out.println("Wrong Choice");
						break;
				}
			}
				break;
			case 2:
				char ch = 'M';
				System.out.println("Second Floor");

				switch(ch) {
				
					case 'M':
					case 'm':
						System.out.println("Dil Bechara");
						break;
					case 'P':
					case 'p':
						System.out.println("Pushball Gaming");
						break;
					default:
						System.out.println("Wrong Choice");
						break;
				}
				break;
			default:
				System.out.println("Wrong Floor Choice");
				break;
		}
	}
}
