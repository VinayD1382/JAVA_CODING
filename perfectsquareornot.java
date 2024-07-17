package CODINGG;

public class perfectsquareornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =6;
		if(isperfectsquare(num)) {
			System.out.println("Perfect Square");
		}else {
			System.out.println("Not Perfect Square");
		}

	}
	public static boolean isperfectsquare(int num) {
		if(num<=-1) {
			return false;
		}
		int sum = 0;
		for(int i=1;i<= num/2;i++) {
			if(num%i==0) {
				sum += i;
			}
		}
		return sum == num;
	}

}
