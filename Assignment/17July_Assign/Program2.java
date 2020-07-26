class calculator {

	int a = 30, b = 10;

	void add() {
	
		int add;
		add = a + b;
		System.out.println("Addition = "+ add);
	}
	
	void sub() {
	
		int sub;
		sub = a - b;
		System.out.println("Substraction = "+ sub);
	}
	
	void mult() {
	
		int mult;
		mult = a * b;
		System.out.println("Multiplication = "+ mult);
	}
	
	void div() {
	
		int div;
		div = a / b;
		System.out.println("Division = "+ div);
	}
	
	void mod() {
	
		int mod;
		mod = a % b;
		System.out.println("Modulus = "+ mod);
	}

	public static void main(String[] args) {
	
		calculator calculate = new calculator();
		calculate.add();
		calculate.sub();
		calculate.mult();
		calculate.div();
		calculate.mod();
	}
}
