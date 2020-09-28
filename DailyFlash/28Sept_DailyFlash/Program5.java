import java.util.*;


class Program5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Rows: ");
		int num = sc.nextInt();

		for(int i = 1; i <= num; i++) {

			int p;
			if(i % 2 == 0)
				p = 0;
			else
				p = 1;

			for(int j = 1; j <= num; j++) {
			
				if(j % 2 == 1 && i % 2 == 1) {

					System.out.print("0 ");
				} else if(j % 2 == 0 && i % 2 == 0) {
				
					System.out.print("0 ");
				} else
					System.out.print("1 ");
			}
			System.out.println();
		}
	}
}
