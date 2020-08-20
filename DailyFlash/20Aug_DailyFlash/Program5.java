

class Program5 {

	public static void main(String[] args) {
	
		int phy = 85;
		int chem = 78;
		int maths = 88;
		int bio = 68;
		int comp = 93;

		double percent = (phy + chem + maths + bio + comp) / 5;
		char grade;

		if(percent > 90)
			grade = 'A';
		else if(percent <= 90 && percent > 80)
			grade = 'B';
		else if(percent <= 80 && percent > 70)
			grade = 'C';
		else if(percent <= 70 && percent > 60)
			grade = 'D';
		else if(percent <= 60 && percent > 50)
			grade = 'E';
		else
			grade = 'F';

		System.out.println("========== Your Result ==========");
		System.out.println("Physics = "+phy);
		System.out.println("Chemistry = "+chem);
		System.out.println("Maths = "+maths);
		System.out.println("Biology = "+bio);
		System.out.println("Computer = "+comp);
		System.out.println("=================================");
		System.out.println("Percentage = "+percent);
		System.out.println("Grade = "+grade);
		System.out.println("=================================");
	}
}
