

class SwitchDemo {

	public static void main(String[] args) {
	
		boolean x = true;

		switch(x) {				//boolean cannot be converted to int
							//boolean is not allowed
			case true: 
				System.out.println("True Case");
				break;
			case false: 				
				System.out.println("Flase Case");
		}
	}
}
