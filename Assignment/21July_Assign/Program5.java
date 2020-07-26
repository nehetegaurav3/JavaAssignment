
class Arithmetic {

	int num1 = 10;
	int num2 = 20;

	static void ArithmeticInfo() {
	
		System.out.println("Arithmetic Operators");
	}

	void ArithmeticOperations() {
	
		int result = num1 + num2;
		System.out.println("Add = "+result);

		result = num1 - num2;
		System.out.println("Sub = "+result);
		
		result = num1 * num2;
		System.out.println("Mult = "+result);
		
		result = num1 / num2;
		System.out.println("Div = "+result);
		
		result = num1 % num2;
		System.out.println("Mod = "+result);
	}
}

class Logical {

	boolean x = true, y = false;

	static void LogicalInfo() {
	
		System.out.println("Logical Operators");
	}
	
	void LogicalOperations() {

		boolean result = x && y;
		System.out.println("AND = "+result);
		
		result = x || y;
		System.out.println("AND = "+result);
		
		result = (!x);
		System.out.println("NOT = "+result);
		
		result = x ^ y;
		System.out.println("X-OR = "+result);
	}
}

class Bitwise {

	int num1 = 15, num2 = 8;

	static void BitwiseInfo() {
	
		System.out.println("Bitwise Operator");
	}

	void BitwiseOperations() {
	
		int result = num1 & num2;
		System.out.println("Bitwise & = "+result);

		result = num1 | num2;
		System.out.println("Bitwise | = "+result);
		
		result = ~num1;
		System.out.println("Bitwise ~ = "+result);
		
		result = num1 << num2;
		System.out.println("Bitwise << = "+result);
		
		result = num1 >> num2;
		System.out.println("Bitwise >> = "+result);
		
		result = num1 >>> num2;
		System.out.println("Bitwise unsigned >>> = "+result);
	}
}

class Program5 {

	public static void main(String[] args) {
	
		Arithmetic obj1 = new Arithmetic();
		Arithmetic.ArithmeticInfo();
		obj1.ArithmeticOperations();
		
		Logical obj2 = new Logical();
		Logical.LogicalInfo();
		obj2.LogicalOperations();
		
		Bitwise obj3 = new Bitwise();
		Bitwise.BitwiseInfo();
		obj3.BitwiseOperations();
	}
}
