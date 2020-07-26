
class IndianArmy {

	int PersonelCount;
      	static int WarWon = 6;

	void ArmyInfo() {
	
		System.out.println("Total Army Personnel Count = "+ PersonelCount);
	}	

	static void WarInfo() {
	
		System.out.println("Total War Won = "+ WarWon);
	}
} 

class IndianAirforce {

	int PersonelCount;
      	static int WarWon = 10;

	void AirforceInfo() {
	
		System.out.println("Total Airforce Personnel Count = "+ PersonelCount);
	}	

	static void WarInfo() {
	
		System.out.println("Total War Won = "+ WarWon);
	}
} 

class IndianNavy {

	int PersonelCount;
      	static int WarWon = 4;

	void NavyInfo() {
	
		System.out.println("Total Navy Personnel Count = "+ PersonelCount);
	}	

	static void WarInfo() {
	
		System.out.println("Total War Won = "+ WarWon);
	}
} 

class IndianDefence {

	public static void main(String[] args) {
	
		System.out.println("===== Army Status in 2000's =====");
		IndianArmy ia2000 = new IndianArmy();
		ia2000.PersonelCount = 1200000;
		ia2000.ArmyInfo();
		IndianArmy.WarInfo();

		System.out.println("===== Army Status in 2020's =====");
		IndianArmy ia2020 = new IndianArmy();
		ia2020.PersonelCount = 1600000;
		ia2020.ArmyInfo();
		IndianArmy.WarInfo();

		System.out.println("===== AirForce Status in 2000's =====");
		IndianAirforce iaf2000 = new IndianAirforce();
		iaf2000.PersonelCount = 100000;
		iaf2000.AirforceInfo();
		IndianAirforce.WarInfo();

		System.out.println("===== AirForce Status in 2020's =====");
		IndianAirforce iaf2020 = new IndianAirforce();
		iaf2020.PersonelCount = 150000;
		iaf2020.AirforceInfo();
		IndianAirforce.WarInfo();
		
		System.out.println("===== Navy Status in 2000's =====");
		IndianNavy in2000 = new IndianNavy();
		in2000.PersonelCount = 50000;
		in2000.NavyInfo();
		IndianNavy.WarInfo();

		System.out.println("===== Navy Status in 2020's =====");
		IndianNavy in2020 = new IndianNavy();
		in2020.PersonelCount = 80000;
		in2020.NavyInfo();
		IndianNavy.WarInfo();
	}
}
