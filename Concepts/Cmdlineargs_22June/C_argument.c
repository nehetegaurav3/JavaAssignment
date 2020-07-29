#include <stdio.h>
           
	void main (int argc,char* argv[]) {
		 //argc is equivalent to length variable in Java
	  	 //char* is representation of String in C
	 	 //char* argv[] is also written as char** argv ----> Because array is internally pointer only.
	 	 //argv is name of array in which command line argument is stored.

		printf("%s\n",argv[0]);	//Output:-./a.out ---> This happens because in C Everything after $ in 
		                        // 		       terminal is command line argument.
		printf("%s\n",argv[1]);
		printf("%s\n",argv[2]);
		printf("%s\n",argv[3]);
		printf("%s\n",argv[4]);
		printf("%d\n",argc);	//Output:- 5
	}

}
/* Output:-

nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ vim C_argument.c
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ cc C_argument.c
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ ./a.out Kedarnath KaiPoChe MSDhoni
./a.out
Kedarnath
KaiPoChe
MSDhoni
Segmentation fault (core dumped)
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ ./a.out Kedarnath KaiPoChe MSDhoni Chhichhore
./a.out
Kedarnath
KaiPoChe
MSDhoni
Chhichhore
5
*/
