package oopsjava;

public class callbyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		modify(x);
		System.out.println(x);

	}
	
	public static int modify(int x) {
		 return x = 8;
		 
	}

}
