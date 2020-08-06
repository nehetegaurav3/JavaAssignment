
class Scholarship {

	public static void main(String[] args) {
	
		int StudYr = 3;
		int StudMarks = 80;
		int Marks = 0;

		switch(StudYr) {
		
			case 3:
				if(StudMarks >= 60)
					Marks = 1;
			
				switch(Marks) {
				
					case 1:
						System.out.println("Student Eligible");
						break;
					default:
						System.out.println("Student Ineligible");
						break;
				}
				break;

			default:
				System.out.println("Student is not Eligible");
				break;
		}
	}
}
