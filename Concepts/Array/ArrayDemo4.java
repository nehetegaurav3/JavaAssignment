

class IPL {

	void matches() {
	
		System.out.println("RCB vs Mumbai");
	}

	public static void main(String[] args) {
	
		IPL ipl = new IPL();
		ipl.matches();

		System.out.println(ipl.getClass());		//getClass() returns class name
		
		int[] arr = new int[5];
		
		System.out.println(arr.getClass());
	}
}
