package oopsjava;

public class callbyreference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,2};
		modify(x);
		System.out.println(x[0]);

	}
	public static int modify(int[] x) {
		return x[0] = 8;
	}

}
