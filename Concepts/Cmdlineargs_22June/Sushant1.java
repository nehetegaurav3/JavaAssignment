
//Command line argument
class Sush {
	//while compiling file -> javac Shushant.java
	//while running file -> java Sush Kedarnath MSD Chhichhore KaiPoChe
	//This is called Command line argument 
					
	public static void main (String... movies) {
	//variable no. of arguments is also represented as above.

		System.out.println(movies.length);
		System.out.println(movies[0]);
		System.out.println(movies[1]);
		System.out.println(movies[2]);
		System.out.println(movies[3]);
	}
}

//Output:-

/*nehetegaurav3@Gaurav:~/Java/22June_Tryouts$ vim Sushant.java
nehetegaurav3@Gaurav:~/Java/22June_Tryouts$ javac Sushant.java
nehetegaurav3@Gaurav:~/Java/22June_Tryouts$ java Sush
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at Sush.main(Sushant.java:9)
nehetegaurav3@Gaurav:~/Java/22June_Tryouts$ java Sush Kedarnath MSDhoni Chhichhore KaiPoChe
Kedarnath
MSDhoni
Chhichhore
KaiPoChe
*/
