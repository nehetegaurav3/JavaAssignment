
class Cricket {

	static int playerCount = 22;
	int runs;
	
	static void matchInfo() {
	
		System.out.println("Total Players = "+ playerCount);
	}

	void runsScored() {
	
		System.out.println("Team Runs = "+ runs);
	}
} 

class Adelaide {

	public static void main(String[] args) {
	
		System.out.println("====== India Innings =====");
		Cricket India = new Cricket();
		Cricket.matchInfo();
		India.runs = 398;
		India.runsScored();

		System.out.println("===== ====== ===== =====");
		System.out.println("David Warner Injured...!");
		System.out.println("===== ====== ===== =====");
		India.playerCount = 21;

		System.out.println("====== Australia Innings =====");
		Cricket Aus = new Cricket();
		Cricket.matchInfo();
		Aus.runs = 250;
		Aus.runsScored();
	}
}
