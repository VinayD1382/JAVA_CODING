package javacode;

public class Fibonic_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 1;
		System.out.println(x);
		System.out.println(y);
		for(int i=0;i<19;i++) {
			int z = x+y;
			System.out.println(z);
			x=y;
			y=z;
		}
	}

}
