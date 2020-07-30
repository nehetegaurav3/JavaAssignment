
class Calculator {

	public static void main(String[] args) {
	
		int num1 = 10, num2 = 20;
		char ch = '+';
		int res;

		switch(ch) {
		
			case '+':
				res = num1 + num2;
				System.out.println("Add = "+res);
				break;
			case '-':
				res = num1 - num2;
				System.out.println("Sub = "+res);
				break;
			case '*':
				res = num1 * num2;
				System.out.println("Mult = "+res);
				break;
			case '/':
				res = num1 / num2;
				System.out.println("Div = "+res);
				break;
			case '%':
				res = num1 % num2;
				System.out.println("Mod = "+res);
				break;
			default:
				System.out.println("Enter correct values");
		}
	}
}
