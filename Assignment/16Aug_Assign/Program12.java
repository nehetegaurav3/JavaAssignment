

class Program12 {

	public static void main(String[] args) {
	
		int i = 5, j = 10, k = 15;
		boolean ans1, ans2, ans3, ans4;

		ans1 = (i <(j - 10))? true:false;
		ans2 = (i == (i = j))? true:false;
		ans3 = ((i & j & k) != 0)? true:false;
		ans4 = ((i ^ j >> 2) == 0)? true:false;

		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		System.out.println(ans4);
	}
}
