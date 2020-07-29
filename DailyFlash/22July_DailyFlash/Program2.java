
class Instagram {

	static boolean InstaInfo(Object obj) {
	
		return (obj instanceof Instagram);
	}

	void InstaParent() {
	
		System.out.println("Parent company is facebook");
	}
}

class Facebook {

	public static void main(String[] args) {
	
		Instagram object = new Instagram();
		boolean result = Instagram.InstaInfo(object) ? true : false;
		System.out.println(result);
	}
}
