

class Program4 {

	public static void main(String[] args) {
	
		String s1 = "Gaurav";
		String s2 = new String("Nehete");

		System.out.println(s1);
		System.out.println(s2);


		s1 = new String("Nehete");		//It Works
		s2 = "Gaurav";				//It Works

		System.out.println(s1);
		System.out.println(s2);
	}
}
