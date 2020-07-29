
class IfElseDemo {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 11;

		if (++x == y++) {
		
			System.out.println("In If Statement");
			System.out.println("X = "+ x);
			System.out.println("Y = "+ y);
		} else {
		
			System.out.println("In Else Statement");
			System.out.println("X = "+ x);
			System.out.println("Y = "+ y);
		}
		System.out.println("Out of If-Else");
	}
}
