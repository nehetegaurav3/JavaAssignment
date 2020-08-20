

class Program2 {

	public static void main(String[] args) {
	
		int principle = 10000;
		int time = 3;
		float rate = 10.05f;

		float SI = principle * (1 + (rate * time));

		System.out.println("Final amount to be paid = "+SI);	
	}
}
