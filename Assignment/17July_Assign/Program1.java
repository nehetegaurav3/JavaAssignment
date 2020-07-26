class dominos {

	int price, quantity;
	static int total;

	static void bill() {
	
		System.out.println("Total Bill Cost = "+ total);
		System.out.println("Thank You...! Visit Again...!");
	}

	public static void main(String[] args) {
	
		dominos pizza = new dominos();
		pizza.price = 275;
		pizza.quantity = 2;
		total = (pizza.price * pizza.quantity);

		dominos fries = new dominos();
		fries.price = 60;
		fries.quantity = 5;
		total = total + (fries.price * fries.quantity);

		dominos.bill();
	}
}
