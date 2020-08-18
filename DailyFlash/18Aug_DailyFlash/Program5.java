

class Program5 {

	public static void main(String[] args) {
	
		int num1 = 1, num2 = 4, num3 = 2;

		if(num1 >= num2 && num1 >= num3)
			System.out.printf("%d is Max number among %d, %d & %d\n",num1,num1,num2,num3);
		else if(num2 >= num1 && num2 >= num3)
			System.out.printf("%d is Max number among %d, %d & %d\n",num2,num1,num2,num3);
		else
			System.out.printf("%d is Max number among %d, %d & %d\n",num3,num1,num2,num3);
	}
}
