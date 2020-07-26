

class Cricket {

	public static void main(String[] args) {
	
		Cricket Test = new Cricket();
		Cricket T20 = new Cricket();
		Cricket ODI = new Cricket();

		boolean res;

		System.out.println(Cricket instanceof Object);
		res = Test instanceof Cricket;
		System.out.println("Result = "+res);
		res = T20 instanceof Object;
		System.out.println("Result = "+res);
		res = ODI instanceof Cricket;
		System.out.println("Result = "+res);
	}
}
