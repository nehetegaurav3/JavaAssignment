
class Exam {

	boolean isEligible(int attendance) {
	
		if(attendance >= 75)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
	
		int attendance = 65;
		Exam student1 = new Exam();
		
		boolean eligibility = student1.isEligible(attendance);

		if (eligibility == true)
			System.out.println("Student 1 is Eligible");
		else
			System.out.println("Student 1 is not Eligible");
	}
}
