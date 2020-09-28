import java.util.*;


class InputScanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Integer, String, Character & Float Values: ");
		int x = sc.nextInt();
		String y = sc.next();
		char z = sc.next().charAt(0);		//Gets first character from string input
		float f = sc.nextFloat();

		System.out.println("Integer = "+ x);
		System.out.println("String = "+ y);
		System.out.println("Character = "+ z);
		System.out.println("Float = "+ f);
	}
}
