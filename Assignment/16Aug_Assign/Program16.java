

class Program16 {

	public static void main(String[] args) {
	
		int num = 1;
		int tempnum;
		
		while(num <= 100) {
		
			tempnum = num;
			
			while(num != 0) {
			
				int rem = num % 10;

				if(tempnum % rem != 0) { 
					
					num = num / 10;
					break;
				}	
				num = num / 10;
			}
			
			if(num == 0)
				System.out.print(tempnum+"  ");

			num = tempnum;
			num++;
		}
	}
}
