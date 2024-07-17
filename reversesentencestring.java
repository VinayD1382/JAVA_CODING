package CODINGG;

public class reversesentencestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a Programming Language";
        String reversed = reverseStringWithSpaces(str);
	    System.out.println("Original sentence: " + str);
	    System.out.println("Reversed sentence: " + reversed);

	}
	public static String reverseStringWithSpaces(String str) {
		String[] arr = str.split(" ");
		
		StringBuilder st = new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			st.append(arr[i]);
			if(i>0) {
				st.append(" ");
			}
		}
		
		return st.toString();
	}
	

}
