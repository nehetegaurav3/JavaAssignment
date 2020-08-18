

class Program3 {

	public static void main(String[] args) {
	
		char ch = '*';

		if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
			System.out.println(ch+" is an Alphabet");
		else if(ch >= '0' && ch <= '9')
			System.out.println(ch+" is a Number");
		else
			System.out.println(ch+" is special character");
	}
}
