package javacode;

public class reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "VINAY";
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i) + " ";
		} 
		System.out.print("Reverese value of it : " + rev);

	}

}
