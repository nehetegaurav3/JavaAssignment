import java.io.*;


class IPLTeam {

	String teamName;
	String captain;
	int jerseyNum;
	String franchiseOwner;
	int countOfTrophiesWon;
}

class Program1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		IPLTeam obj = new IPLTeam();

		System.out.print("Enter Team Name: ");
		obj.teamName = br.readLine();
		System.out.print("Enter Captain Name: ");
		obj.captain = br.readLine();
		System.out.print("Enter Jersey Number: ");
		obj.jerseyNum = Integer.parseInt(br.readLine());
		System.out.print("Enter Franchise Owner Name: ");
		obj.franchiseOwner = br.readLine();
		System.out.print("Enter Count of Trophies Won: ");
		obj.countOfTrophiesWon = Integer.parseInt(br.readLine());
		
		System.out.println("\nTeam Name: "+obj.teamName);
		System.out.println("Team Captain: "+obj.captain);
		System.out.println("Jersey Number: "+obj.jerseyNum);
		System.out.println("Team Owner: "+obj.franchiseOwner);
		System.out.println("Trophies Won: "+obj.countOfTrophiesWon);
	}
}
