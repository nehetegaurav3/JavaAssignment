

class CoronaMaha {

	int count = 170000;

	void precaution() {
	
		System.out.println("Take Precaution");
		System.out.println("Count = "+ count);
	}

	static void impDecision() {
	
		System.out.println("CM's Decision");
	}

	public static void main(String[] args) {
	
		CoronaMaha June28 = new CoronaMaha();
		June28.precaution();
		June28.impDecision();
		
		CoronaMaha June29 = new CoronaMaha();
		June29.count = 175000;
		June29.precaution();
	}
}
