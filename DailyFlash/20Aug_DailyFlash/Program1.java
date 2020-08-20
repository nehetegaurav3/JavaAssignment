

class Program1 {

	public static void main(String[] args) {
	
		int side1 = 3;
		int side2 = 4;
		int hyp = 5;

		if((hyp * hyp) == (side1 * side1) + (side2 * side2))
			System.out.println("Triangle satisfies Pythagoras Theorem");
		else
			System.out.println("Triangle doesn't satisfy Pythagoras Theorem");
	}
}
