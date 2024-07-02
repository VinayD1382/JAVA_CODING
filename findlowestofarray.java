package datastructure;

public class findlowestofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,2,8,6,3};
	    int low =arr[0];
	    
	    for(int i=0;i<arr.length;i++) {
	    	if(arr[i]<low) {
	    		low = arr[i];
	    	}
	    }
	    System.out.println(low);

	}

}
