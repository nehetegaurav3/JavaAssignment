

class Program5 {

	public static void main(String[] args) {
	
		int ang1 = 30, ang2 = 60, ang3 = 70;
		int sum = ang1 + ang2 + ang3;

		if(sum > 0 && sum <= 180)
			System.out.printf("Triangle is valid with angles %d, %d & %d\n",ang1,ang2,ang3);
		else
			System.out.printf("Triangle is invalid with angles %d, %d & %d\n",ang1,ang2,ang3);
	}
}
