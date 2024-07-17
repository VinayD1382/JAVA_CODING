package CODINGG;

public class missingnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,6,7,8,9,10};
		int n = arr.length + 1;
		int calculatedsum = n * (n+1)/2;
		int sum = 0;
		for(int i=0;i<n-1;i++) {
			sum = sum + arr[i];
		}
		int result = calculatedsum - sum ;
      System.out.println("The missing number is : " + result);
	}

}
