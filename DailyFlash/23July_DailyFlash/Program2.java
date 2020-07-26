
class Program2 {

	public static void main(String[] args) {
	
		int angle = 20;

		if(angle > 0 && angle < 90) {
		
			System.out.println("Angle = "+ angle);
			System.out.println("Angle is Acute");
		} else if(angle == 90) {
		
			System.out.println("Angle = "+ angle);
			System.out.println("Angle is Right");
		} else{
		
			System.out.println("Angle = "+ angle);
			System.out.println("Angle is Obtuse");
		}
	}
}
