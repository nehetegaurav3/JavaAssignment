class BitwiseOperator {
	
	public static void main(String[] args) {
	    
		int num1 = 15,num2 = 40;
		long lNum1 = 98658,lNum2 = 99868;
		//float fNum1 = 8.60,fNum2 = 25.5;
		//double dNum1 = 25.1350,dNum2 = 18.2056;
		char ch1 = 'A',ch2 = 'Z';
	    
		System.out.println(num1 & num2);
		System.out.println(lNum1 & lNum2);
		System.out.println(ch1 & ch2);
		 
		System.out.println(num1 | num2);
		System.out.println(lNum1 | lNum2);
		System.out.println(ch1 | ch2);
		
		System.out.println(num1 ^ num2);
		System.out.println(lNum1 ^ lNum2);
		System.out.println(ch1 ^ ch2);
	}
}
/*
 *Conclusion:- float and double values are not allowed in Bitwise Operator
 *
*/
