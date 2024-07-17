package CODINGG;

public class permutationofString {

	public static void permut(String input,String val) {
		if(input.isEmpty()) {
			System.out.println(val);
		}else {
			for(int i=0;i<input.length();i++) {
				permut(input.substring(0,i) + input.substring(i+1), val + input.charAt(i));
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permut("ABC","");

	}

}
