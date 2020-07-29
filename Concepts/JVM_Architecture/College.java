
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
	
		PICT ac2019 = new PICT();
		ac2019.placementCount = 175;
		ac2019.placement();
		ac2019.student();	

		PICT ac2020 = new PICT();
		ac2020.placementCount = 70;
		ac2020.placement();
		ac2020.student();
		
		SCOE yr2019 = new SCOE();
		yr2019.placementCount = 300;
		yr2019.placement();
		yr2019.student();	

		SCOE yr2020 = new SCOE();
		yr2020.placementCount = 150;
		yr2020.placement();
		yr2020.student();
	}
}
