

class StringDemo {

	public static void main(String[] args) {
	
		String s1 = "Core2Web";			//Doesn't Call Contructor of String Class
			//Object is created in Method Area(inside String Constant Pool)
			//Also called as "String Literal"
		
		String s2 = new String("BiEncaps");	//Calls Constructor of String Class
		/*	Object is created on Heap Memory with Reference as well as in SCP without
			reference(Only if same string is not present in SCP)	*/

			//Also called as "String Object"

		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.toString());	//Can still call StringClassMethods
		System.out.println(s2.toString());	//Its an object so it can call StringClassMethods
	}
}
