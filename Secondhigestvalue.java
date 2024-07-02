package javacode;

public class Secondhigestvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,5,6,7,8,9,4,2,5};
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		}
		System.out.println("The first higest value is : " + first + "  The second vslue is : " + second);

	}

}
