
//Byte
//-128 to 127

class byteDemo {

	public static void main(String[] args) {
	
		byte a = 127;

		System.out.println(a);
		a++;
		System.out.println(a);
	}
}

//Short
//-32768 to 32767

class shortDemo {

	public static void main(String[] args) {
	
		short b = 32767;

		System.out.println(b);
		b++;
		System.out.println(b);
	}
}

//Integer

class intDemo {

	public static void main(String[] args) {
	
		int c = 64276;

		System.out.println(c);
		c++;
		System.out.println(c);
	}
}

//Long

class longDemo {

	public static void main(String[] args) {
	
		long d = 105602;

		System.out.println(d);
		d++;
		System.out.println(d);
	}
}

//character
//-128 to 127

class charDemo {

	public static void main(String[] args) {
	
		char e = 'S';

		System.out.println(e);		//Prints character 'S'
		
		char f = 65;
		System.out.println(f);		// Prints 'A' accoring to Unicode
	}
}

//float and Double

class floatDemo {

	public static void main(String[] args) {
	
		float g = 25.6f;
		System.out.println(g);
	
		double h = 25.6;
		System.out.println(h);

		if(g == h)
			System.out.println("Same Value");
		else
			System.out.println("Different Value");
	}
}

//Boolean

class booleanDemo {

	public static void main(String[] args) {
	
		boolean i = true;
		System.out.println(i);
		
		//boolean j = 0;		//Error: It cannot have integer value
		//System.out.println(j);
	}
}
