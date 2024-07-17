package CODINGG;

public class lowertoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str = "VINAYD";
		lowercase(str);
	}
	public static void lowercase(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(65<=ch && ch<=90) {
				ch = (char)((ch+32));
			System.out.print(ch);
			}
		}*/
		//Lower to Higher
		String str = "vinayd";
		lowercase(str);
	}
	public static void lowercase(String str) {
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(97<=ch && ch<=122) { //ASCCI value of A is 65 ,+32 is small a ,for all alphabet same 67+32 = c just add 32.
				ch = (char)((ch-32));
			System.out.print(ch);
			}
		}
	}

}
