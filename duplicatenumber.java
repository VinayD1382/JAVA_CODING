package CODINGG;

public class duplicatenumber {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is a programming language and python is also a programming language";
		String str2 = " ";
      str = str.toLowerCase();
      String arr[] = str.split(" ");
      
      for(int i=0;i<arr.length-1;i++) {
    	  for(int j=i+1;j<arr.length;j++) {
    		  if(arr[i].equals(arr[j])) {
    			  str2 = str2 + arr[i] + " , ";
    		  }
    	  }
      }
      System.out.println(str2);
      
	}

}
