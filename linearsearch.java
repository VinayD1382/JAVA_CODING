package javacode;

public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,6,7,8,9};
		int target = 8;
		for(int i=0;i<arr.length;i++) {
		  if(arr[i]==target) {
				int val = i;
				System.out.println("The index found : " + val);
			}
		}



}

	}

