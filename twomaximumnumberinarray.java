package CODINGG;

public class twomaximumnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,8,4,5,6,7};
		int first =Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}else if(arr[i]>second && arr[i]<first){
				second = arr[i];
			}
		}
		System.out.println("two highest value in array : " + first + " & " + second);

	}

}
