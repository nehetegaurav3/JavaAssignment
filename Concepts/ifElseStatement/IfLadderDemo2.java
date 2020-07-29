

class IfLadderDemo {

	public static void main(String[] args) {
	
		int x = -25;

		if(x >= 0 && x <= 10) {
		
			System.out.println("Number between 0 and 10");
		} else if(x >=11 && x <= 20){
		
			System.out.println("Number between 11 and 20");
		} else if(x >= 20) {
		
			System.out.println("Number greater than 20");
		} else {
		
			System.out.println("Enter Positive Number");
		}
	}
}
