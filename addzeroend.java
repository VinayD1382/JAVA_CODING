package CODINGG;

public class addzeroend {

    public static void main(String[] args) {
    	int[] arr = {1,2,3,4,5,0,7,8,0,10};
    	int n = arr.length;
    	int[] arr1 = zeroends(arr,n);
    	for(int i=0;i<arr1.length;i++) {
    		System.out.print(arr1[i] + " ");
    	}
     }
    public static int[] zeroends(int[] arr,int n) {
    	int[] newarray = new int[arr.length];
    	int count = 0;
    	for(int i=0;i<n;i++) {
    		if(arr[i]!=0) {
    			newarray[count++] = arr[i];
    		}
    	}
    	while(count<newarray.length) {
    		newarray[count++] = 0;
    	}
    return newarray;
    }
}

