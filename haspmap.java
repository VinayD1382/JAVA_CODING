package datastructure;
import java.util.HashMap;
public class haspmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> obj = new HashMap<>();
		obj.put(1,"CANARA");
		obj.put(2, "VINAY");
		
		String val1 = obj.get(1);
		String val2 = obj.get(2);
		
		System.out.println("The value present in key 1  :  " + val1 + " and key 2 : " + val2);

	}

}
