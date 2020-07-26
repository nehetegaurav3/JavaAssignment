
class Capgemini {

	static int noOfEmp = 200000;
	int projectCount = 200;

	void displayProject() {
	
		System.out.println("Capgemini Project Count = "+ projectCount);
	}

	static void empInfo() {
	
		System.out.println("Capgemini Total Employee = "+ noOfEmp);
	}
}

class TCS {

	static int noOfEmp = 300000;
	int projectCount = 350;

	void displayProject() {
	
		System.out.println("TCS Project Count = "+ projectCount);
	}

	static void empInfo() {
	
		System.out.println("TCS Total Employee = "+ noOfEmp);	
	}
	
}

class ITCompanies {

	public static void main(String[] args) {
	
		Capgemini Pune = new Capgemini();
		Pune.projectCount = 130;
		Pune.displayProject();
		Pune.empInfo();	

		Capgemini Chennai = new Capgemini();
		Chennai.projectCount = 70;
		Chennai.displayProject();
		Chennai.empInfo();
		
		TCS Mumbai = new TCS();
		Mumbai.projectCount = 200;
		Mumbai.displayProject();
		Mumbai.empInfo();	

		TCS Banglore = new TCS();
		Banglore.projectCount = 150;
		Banglore.displayProject();
		Banglore.empInfo();
	}
}
