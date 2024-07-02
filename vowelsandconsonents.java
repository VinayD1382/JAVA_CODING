package javacode;

public class vowelsandconsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "NELAMANGALA";
		int vow = 0;
		int con = 0;
		String vo = "";
		String co = "";
		str = str.toLowerCase();

		
		for(int i =0;i<str.length();i++) {
		
			char ch = str.charAt(i);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
			vow++;
			vo = vo + ch + " ";
			
		}else {
			con++;
			co = co + ch + " ";
			
		}
		}
		System.out.println("Vowels are : " + vow + " : " +  vo );
		System.out.println("Consonents are : " + con +" : "+ co);
		
	}

}
