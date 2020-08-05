

import java.lang.*;

class NewWorld {
	
	/*	NewWorld() {
	 *	
	 *	super;
	 *	int a = 10;
	 *
	 *	}
	*/

	int a = 10;
	static int b = 20;

	void fun() {
	
		System.out.println("In fun");
	}

	static void happy() {
	
		System.out.println("In happy");
	}
}

class main {

	public static void main(String[] args) {
	
		NewWorld obj = new NewWorld();

		NewWorld.happy();

		obj.fun();

		System.out.println(NewWorld.b);
		
		System.out.println(obj.a);

	}
}

/*	static{
 *
 *	int b = 20;
 *
 *	}
*/
