package javacode;

public class fibonic_recursion {
	
	static int count = 1;
	
	public static void fibonic(int x,int y) {
		
		if(count<19) {
		int z = x + y;

	System.out.println(z);
	x=y;
	y=z;
	 count++;
	fibonic(x,y);
	}
	}
	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		System.out.println(x);
		System.out.println(y);
		fibonic(x,y);
	}
	}


