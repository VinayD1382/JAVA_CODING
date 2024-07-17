package CODINGG;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int number = 1543;
      int res = Armstrong(number);
      if(res==number) {
    	  System.out.println("Anagram");
      }else {
    	  System.out.println("Not Anagram");
      }
	}
	public static int Armstrong(int number) {
		int originalnumber = number;
		int eachno = String.valueOf(number).length();
		int Sum =0 ;
		while(number>0) {
	
			int val = number%10;
			 Sum += Math.pow(val, eachno);
			 number = number/10; 
		
		}
		return Sum ;
	}

}
