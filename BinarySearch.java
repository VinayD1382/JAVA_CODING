package javacode;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int tar = 7;
		int res = isbinary(arr,tar);
		if(res!=0) {
			System.out.println("The value found in index :" + res );
		}else {
			System.out.println("The vlaue of index not found ");
		}
	}
	
	public static int isbinary(int[] arr,int tar) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int mid = (left+right)/2;
			if(arr[mid]==tar) {
				return mid;
			}
			if(arr[mid]<tar) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		
		return 0;
	}

}
