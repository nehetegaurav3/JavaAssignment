
/*javac Integer.java
* java AddInteger 10 20
* This code below proves that command line argument is of type String Only.
*/
class AddInteger {

	public static void main(String[] args) {
	
		System.out.println(args[0]+args[1]);  
		
		/*
		* Output:- 1020 	//Because array is of type String. 
		*/
		
		//If we expect output in Integer Format then follow procedure below.
	
		int a = Integer.parseInt(args[0]);
	        int b =	Integer.parseInt(args[1]);

		System.out.println(a+b);  // Output:- 30
	}
}
