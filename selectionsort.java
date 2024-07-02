package datastructure;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,7,8,9,6,2,3,1};
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min_indes = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_indes]) {
					  min_indes = j;	
				}
			}
				int temp = arr[min_indes];
				arr[min_indes] = arr[i];
				arr[i] = temp;
			}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
