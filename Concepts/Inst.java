


class Family {

	int mob = 1;
	int laptop = 1;
	static int tv = 1;

	void display() {
	
		System.out.println("In Display");
	}

	static void statdisplay() {
	
		System.out.println("In StatDisplay");
	}

	public static void main(String[] args) {
	
		Family obj1 = new Family();
		obj1.display();
		obj1.statdisplay();

		Family obj2 = new Family();
		obj2.display();
		obj2.statdisplay();
	}

}
