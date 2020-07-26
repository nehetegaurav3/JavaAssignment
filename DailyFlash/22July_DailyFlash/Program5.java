
class OutdoorGames {

	public static void main(String[] args) {
	
		OutdoorGames chess = null;
		OutdoorGames ludo = null;
		OutdoorGames cricket = new OutdoorGames();
		OutdoorGames football = new OutdoorGames();

		boolean result = chess instanceof OutdoorGames;
		System.out.println("Chess is Outdoor Game : "+ result);
		
		result = ludo instanceof OutdoorGames;
		System.out.println("Ludo is Outdoor Game : "+ result);
		
		result = cricket instanceof OutdoorGames;
		System.out.println("Cricket is Outdoor Game : "+ result);
		
		result = football instanceof OutdoorGames;
		System.out.println("FootBall is Outdoor Game : "+ result);
	}
}
