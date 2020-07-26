

class Pune {

	static int covidActiveCases = 0;
	int totalCases = 0;

	static void noCorona() {
	
		Pune obj = new Pune();
		System.out.println("COVID Active Cases = "+ covidActiveCases);
		System.out.println("Total Cases = "+ obj.totalCases);
	}

	void lockdown() {
	
		covidActiveCases = 1000;
		totalCases = 1200;
		
		System.out.println("COVID Active Cases = "+ covidActiveCases);
		System.out.println("Total Cases = "+ totalCases);
	}

	void noLockdown() {
	
		covidActiveCases = 8000;
		totalCases = 11000;
		
		System.out.println("COVID Active Cases = "+ covidActiveCases);
		System.out.println("Total Cases = "+ totalCases);
	}
}

class Mumbai {

	static int covidActiveCases = 0;
	int totalCases = 0;

	static void noCorona() {

		Mumbai obj = new Mumbai();	
		System.out.println("COVID Active Cases = "+ covidActiveCases);
		System.out.println("Total Cases = "+ obj.totalCases);
	}

	void lockdown() {
	
		covidActiveCases = 2500;
		totalCases = 5000;
		System.out.println("COVID Active Cases = "+ covidActiveCases);
		System.out.println("Total Cases = "+ totalCases);
	}

	void noLockdown() {
	
		covidActiveCases = 35000;
		totalCases = 50000;
		System.out.println("COVID Active Cases = "+ covidActiveCases);
		System.out.println("Total Cases = "+ totalCases);
	}
}

class COVIDTimeline {

	public static void main(String[] args) {
	
		System.out.println("Status before COVID19 in Pune");
		Pune.noCorona();
		Pune obj1 = new Pune();
		System.out.println("Status in COVID19 LockDown");
		obj1.lockdown();
		System.out.println("Status after COVID19 LockDown");
		obj1.noLockdown();

		System.out.println("Status before COVID19 in Mumbai");
		Mumbai.noCorona();
		Mumbai obj2 = new Mumbai();
		System.out.println("Status in COVID19 LockDown");
		obj2.lockdown();
		System.out.println("Status after COVID19 LockDown");
		obj2.noLockdown();
	}
}
