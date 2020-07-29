
//Command line argument Assignment

class CmdArgument { 
	
	public static void main (String[] specialChar) {
	
		System.out.println(specialChar.length);
		System.out.println(specialChar[0]);
	}
}

/*Some special characters like # , & , * give different outputs than what is expected. 
 *This maybe due to their functionalities which are already given to them.
 *Or they might not be allowed to be used here.
*/

//Output:-

/*nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ javac Assign.java
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument !
1
!
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument @
1
@
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument #
0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at CmdArgument.main(Assign.java:9)
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument $
1
$
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument %
1
%
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument ^
1
^
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument &
[1] 12569
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ 0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at CmdArgument.main(Assign.java:9)
java CmdArgument &
[2] 12591
[1]   Exit 1                  java CmdArgument
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ 0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at CmdArgument.main(Assign.java:9)
1
1: command not found
[2]+  Exit 1                  java CmdArgument
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument *
11
AddInteger.class
nehetegaurav3@Gaurav:~/Java/Cmdlineargs_22June$ java CmdArgument _
1
_
*/
