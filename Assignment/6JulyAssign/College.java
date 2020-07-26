
class PICT {

	static int noOfStudent = 180;
	int placementCount = 172;

	void placement() {
	
		System.out.println("PICT Placement Count = "+ placementCount);
	}

	static void student() {
	
		System.out.println("PICT Total Student = "+ noOfStudent);
	}
}

class SCOE {

	static int noOfStudent = 360;
	int placementCount = 300;

	void placement() {
	
		System.out.println("SCOE Placement Count = "+ placementCount);
	}

	static void student() {
	
		System.out.println("SCOE Total Students = "+ noOfStudent);	
	}
	
}

class Colleges {

	public static void main(String[] args) {
	
		PICT AC2019 = new PICT();
		AC2019.placementCount = 175;
		AC2019.placement();
		AC2019.student();	

		PICT AC2020 = new PICT();
		AC2020.placementCount = 70;
		AC2020.placement();
		AC2020.student();
		
		SCOE YR2019 = new SCOE();
		YR2019.placementCount = 300;
		YR2019.placement();
		YR2019.student();	

		SCOE YR2020 = new SCOE();
		YR2020.placementCount = 150;
		YR2020.placement();
		YR2020.student();
	}
}
