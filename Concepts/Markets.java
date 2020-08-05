

class Stockmarket {

	int Buy_Price = 320;
	int Sell_Price = 450;
	static int MovingAvg = 20;

	void uptrend() {
	
		System.out.println("Making Profits");
	}

	static void downtrend() {
	
		System.out.println("In Loss");
	} 
}


class PriceAccess {

	public static void main(String[] args) {
	
		Stockmarket obj = new Stockmarket();
		obj.uptrend();
		Stockmarket.downtrend();	
		System.out.println(obj.Buy_Price);
		System.out.println(obj.Sell_Price);
		System.out.println(Stockmarket.MovingAvg);
	}
}
