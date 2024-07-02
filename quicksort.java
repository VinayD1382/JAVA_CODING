package datastructure;

public class quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,9,6,3,2,1,7};
		int n = arr.length;
		int high = n-1;
		int low = 0;
		quicksort(arr,low,high);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void quicksort(int[] arr,int low,int high) {
		if(low<high) {
			int pivotindex = partition(arr,low,high);
			quicksort(arr,low,pivotindex-1);
			quicksort(arr,pivotindex+1,high);
		}
	}
	
	public static int partition(int[] arr,int low,int high) {
		int pivot = arr[high];
		int i = low -1;
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp = arr[j];
				arr[j]=arr[i];
				arr[i] = temp;
			}
		}
		int tempu = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = tempu;
		return i+1;
	}

}
