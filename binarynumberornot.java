package CODINGG;

public class binarynumberornot {
	public static void main(String[] args){
        String binary = "010001001";
        boolean res = findbinary(binary);
        if(res==true){
        System.out.println("The number is Binary : " + res);
        }else{
            System.out.println("The number is NOT Binary");
        }
    }
        public static boolean findbinary(String binary){
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)!='0' && binary.charAt(i)!='1' ){
                return false;
            }
        }
        return true;
    }
}
