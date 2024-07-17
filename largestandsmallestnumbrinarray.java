package CODINGG;

public class largestandsmallestnumbrinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int largest = arr[0];
		int small = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small = arr[i];
			}else if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		System.out.println("The highest Number in Array : " + largest);
		System.out.println("The Smallest Number in Array : " + small);

	}

}
