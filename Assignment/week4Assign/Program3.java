
class vegMarket {

	static int price = 100;

	static void auction() {
	
		System.out.println("Vegetable Auction Completed, Price Fixed.");
	}

	void purchase() {

                System.out.println("Buy Fresh Vegetable");

		vegMarket obj = new vegMarket();
		System.out.println("Cost ="+ obj.price);
        }
	
	public static void main(String[] args) {
	
		vegMarket.auction();

		vegMarket callobj = new vegMarket();
		callobj.purchase();
	}

}
