

class Program3 {

	public static void main(String[] args) {
	
		String s1 = "Gaurav";
		//Object is created in Method Area(inside String Constant Pool)
		//Also called as "String Literal"
		
		String s2 = new String("Nehete");
		/*	Object is created on Heap Memory with Reference as well as in SCP without
			reference(Only if same string is not present in SCP)	*/
		//Also called as "String Object"
	}
}
