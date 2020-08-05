

class vegMarket {

	int a = 10;
	
	void Vegetables() {
	
		System.out.println("Buy Vegetables");
		System.out.println("Value of a = "+ a);
	}

	static void Decision() {
	
		System.out.println("Only on Friday");
		vegMarket callobj = new vegMarket();
		System.out.println("Value of a = "+ callobj.a);
	} 

	public static void main(String[] args) {
	
		vegMarket obj = new vegMarket();
		obj.Vegetables();
		vegMarket.Decision();
	}
}
