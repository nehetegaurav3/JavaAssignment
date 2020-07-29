
class ChineseApps{

	int TotalCount;
	static int BanCount = 59;

	void AppIndustry() {
	
		System.out.println("Total Chinese Apps = "+ TotalCount);
	}

	static void action() {
	
		System.out.println("Total Apps Banned = "+ BanCount);
	}
}

class StrictAction{

	public static void main(String[] args) {
	
		System.out.println("===== Chinese Apps Status in July =====");
		ChineseApps july = new ChineseApps();
		july.TotalCount = 5000;
		july.AppIndustry();
		ChineseApps.action();

		System.out.println("===== Chinese Apps Status in August =====");
		ChineseApps aug = new ChineseApps();
		aug.TotalCount = 7000;
		aug.AppIndustry();
		ChineseApps.action();

	}
}
