

class Program3 {

	public static void main(String[] args) {
	
		int year = 1800;

		if(year % 400 == 0) {
	
			System.out.println(year+" is a century leap year");
		} else if(year % 4 == 0){
	
			System.out.println(year+" is a leap year");
		} else {
	
			System.out.println(year+" is not a leap year");
		}
	}
}
