
class Human {

	public static void main(String[] args) {
	
		Human lion = null;
		Human tiger = null;
		Human puma = null;
		Human monkey = new Human();

		boolean isLionHuman = lion instanceof Human;
		System.out.println("Are Lion and Human of same species --> "+ isLionHuman);
		
		boolean isTigerHuman = tiger instanceof Human;
		System.out.println("Are Tiger and Human of same species --> "+ isTigerHuman);
		
		boolean isPumaHuman = puma instanceof Human;
		System.out.println("Are Puma and Human of same species --> "+ isPumaHuman);
		
		boolean isMonkeyHuman = monkey instanceof Human;
		System.out.println("Are Monkey and Human of same species --> "+ isMonkeyHuman);
	}
}
