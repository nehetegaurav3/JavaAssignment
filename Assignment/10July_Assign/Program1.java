import java.lang.*;

class YewaleChaha {

	static int branches = 10;
	int teaCount;
	
	static void branchInfo() {
	
		System.out.println("Yewale Chaha Total Branches = "+ branches);
	}

	void teaSell() {
	
		System.out.println("Tea Sold = "+ teaCount);
	}
}

class RohitWadewale {

	static int branches = 5;
	int vadaCount;

	static void branchInfo() {
	
		System.out.println("Rohit Wadewale Total Branches = "+ branches);
	}

	void vadaSell() {
	
		System.out.println("Vada Sold = "+ vadaCount);
	}
}

class SellInfo {

	public static void main(String[] args) {

		System.out.println("===== For ShivajiNagar Branch =====");
		YewaleChaha shivajinagar = new YewaleChaha();
		shivajinagar.teaCount = 1000;
		YewaleChaha.branchInfo();
		shivajinagar.teaSell();

	
		System.out.println("===== For SadashivPeth Branch =====");
		YewaleChaha sadashivpeth = new YewaleChaha();
		sadashivpeth.teaCount = 500;
		YewaleChaha.branchInfo();
		sadashivpeth.teaSell();

	
		System.out.println("===== For NavaleBridge Branch =====");
		RohitWadewale navalebridge = new RohitWadewale();
		navalebridge.vadaCount = 800;
		RohitWadewale.branchInfo();
		navalebridge.vadaSell();

	
		System.out.println("===== For PaudRoad Branch =====");
		RohitWadewale paudroad = new RohitWadewale();
		paudroad.vadaCount = 600;
		RohitWadewale.branchInfo();
		paudroad.vadaSell();

	}
}
