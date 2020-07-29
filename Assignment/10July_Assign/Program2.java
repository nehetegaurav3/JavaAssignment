import java.lang.*;

class KakaHalwai {

	static int PedhaRate = 400;
	int quantity;

	static void Rate() {
	
		System.out.println("Rate for Today(in Rs.) = "+ PedhaRate);
	}

	void TotalSell() {
	
		System.out.println("Total Quantity Purchased(in kgs) = "+ quantity);
	}
}

class McDonalds {

	static int McVegieCost = 98;
	int quantity;

	static void Cost() {
	
		System.out.println("Cost of Burger(in Rs.) = "+ McVegieCost);
	}

	void TotalSell() {
	
		System.out.println("Total Quantity Purchased(in nos) = "+ quantity);
	}
}

class StoreInfo {

	public static void main(String[] args) {
	
		System.out.println("===== For KakaHalwai Customer 1 =====");
		KakaHalwai person1 = new KakaHalwai();
		person1.quantity = 5;
		KakaHalwai.Rate();
		person1.TotalSell();

		System.out.println("===== For KakaHalwai Customer 2 =====");
		KakaHalwai person2 = new KakaHalwai();
		person2.quantity = 10;
		KakaHalwai.Rate();
		person2.TotalSell();
		
		System.out.println("===== For McD Customer 1 =====");
		McDonalds customer1 = new McDonalds();
		customer1.quantity = 2;
		McDonalds.Cost();
		customer1.TotalSell();

		System.out.println("===== For McD Customer 2 =====");
		McDonalds customer2 = new McDonalds();
		customer2.quantity = 4;
		McDonalds.Cost();
		customer2.TotalSell();
	}
}
