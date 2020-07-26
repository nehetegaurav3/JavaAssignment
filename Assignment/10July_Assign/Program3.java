import java.lang.*;

class BehrouzBiryani {

	static int serving = 650;
	int chickenRequired;

	static void Serving() {
	
		System.out.println("Behrouz Standard Serving(in gms) = "+ serving);
	}

	void Requirement() {
	
		System.out.println("Required Chicken(in kgs) = "+ chickenRequired);
	}
}

class ChangsRestaurant {

	static int serving = 500;
	int noodlesRequired;

	static void Serving() {
	
		System.out.println("Chang's Chinese Restaurant Serving(in gms) = "+ serving);
	}

	void Requirement() {
	
		System.out.println("Required Noodles(in kgs) = "+ noodlesRequired);
	}
}

class RequirementInfo {

	public static void main(String[] args) {

		System.out.println("===== For Pune Branch =====");
		BehrouzBiryani Pune = new BehrouzBiryani();
		Pune.chickenRequired = 20;
		BehrouzBiryani.Serving();
		Pune.Requirement();
	
		System.out.println("===== For Mumbai Branch =====");
		BehrouzBiryani Mumbai = new BehrouzBiryani();
		Mumbai.chickenRequired = 40;
		BehrouzBiryani.Serving();
		Mumbai.Requirement();

		System.out.println("===== For Swargate Branch =====");
		ChangsRestaurant Swargate = new ChangsRestaurant();
		Swargate.noodlesRequired = 15;
		ChangsRestaurant.Serving();
		Swargate.Requirement();
	
		System.out.println("===== For Narhe Branch =====");
		ChangsRestaurant Narhe = new ChangsRestaurant();
		Narhe.noodlesRequired = 30;
		ChangsRestaurant.Serving();
		Narhe.Requirement();
	}
}
