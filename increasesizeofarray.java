package datastructure;

import java.util.Arrays;

public class increasesizeofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
		}
		System.out.print(" | ");
		
		int newsize = arr.length - 3;
		int[] newarr = Arrays.copyOf(arr, newsize);
		/*newarr[5] = 6;
		newarr[6] = 7;
		newarr[7] = 8;*/
		for(int i=0;i<newsize;i++) {
			System.out.print( newarr[i] + " ");
		}
	}

}
