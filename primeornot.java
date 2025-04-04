package CODINGG;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num = 13;
         if(primenum(num)) {
        	 System.out.println("Prime number");
         }else {
        	 System.out.println("Not prime number");
         }
	}
	public static boolean primenum(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(num);i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
	}

}
// so prvate variable if we use obj.name = "Vinay" its n error
//so private variable that can be access only wth getter and setter can we change the value 
