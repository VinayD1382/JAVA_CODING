package javacode;

public class trnaspose_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original matrix ");
		matrix(arr);
		
		int[][] trans = transpase(arr);
		System.out.println("transpose matrix ");
		matrix(trans);
		
	}
		public static int[][] transpase(int[][] arr){
			int col = arr[0].length;
			int row = arr.length;
			int[][] transp = new int[col][row];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
				transp[j][i] = arr[i][j];
			}
		}
			return transp;
			
	}
		public static void matrix(int[][] arr) {
			for(int[] colu : arr) {
				for(int rorw : colu) {
					System.out.print(rorw);
				}
				System.out.println();
			}
		}
}