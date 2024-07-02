package datastructure;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 6;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("The value 6 found at index : " + i);
			}
		}

	}

}
