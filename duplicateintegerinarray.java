package CODINGG;
import java.util.HashSet;
public class duplicateintegerinarray {
    public static void main(String[] args) {
    	int[] array = {1,2,3,4,8,9,1,2};
    	HashSet<Integer> obj = new HashSet<>();
    	for(int i=0;i<array.length;i++) {
    		if(obj.add(array[i])==false) {
    			System.out.println(" Already Present " + array[i]);
    		}
    	}
    }
}