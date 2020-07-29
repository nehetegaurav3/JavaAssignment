

class SwitchDemo {

	public static void main(String[] args) {
	
		long x = 64255;

		switch(x) {			//Only byte,short,int,char is allowed
		
			case 64255: 
				System.out.println("First case");
				break;
			default : 
				System.out.println("In Default");
				break;
		}
	}
}
