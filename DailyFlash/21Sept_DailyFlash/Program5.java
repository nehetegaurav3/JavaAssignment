import java.lang.*;


class Program5 {

	public static void main(String[] args) {
	
		int x, y, z;
		
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		
		z = x + y;
		
		System.out.printf("Addition of %d and %d = %d\n",x,y,z);
	}
}
