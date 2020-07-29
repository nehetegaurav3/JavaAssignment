
class Program3 {

	public static void main(String[] args) {
	
		int num1 = 188;
		int num2 = 255;
		int num3 = -108;
		int num4 = -123;
		int result;

		result = num1 >>> 4;
		System.out.println("Answer = "+ result);
		
	//	result = num2 <<< 3;
	//	System.out.println("Answer = "+ result);
		
		result = num3 >>> 23;
		System.out.println("Answer = "+ result);
		
	//	result = num4 <<< 15;
	//	System.out.println("Answer = "+ result);
	}
}
/*
 * Conclusion:-
 * 
 * Unsigned bitwise shift operator is allowed only in right shift.
 *
 * This is because sign significant bit can become 1 if we shift it to left
 *
 * and if it is changed to 0 directly.. Data loss may occur.
 */
