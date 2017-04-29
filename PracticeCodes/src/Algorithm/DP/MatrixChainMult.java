package Algorithm.DP;

public class MatrixChainMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,3};
		int len = arr.length;
		System.out.println(CalcMinMatrixMul(arr,len));
	}

	private static int CalcMinMatrixMul(int[] arr, int len) {
		// TODO Auto-generated method stub
		int[][] m = new int[len][len];
		for(int i=1;i<len;i++)
			m[i][i] = 0;
		for(int L=2;L<len;L++){
			for(int i=1;i<len-L+1;i++){
				int j=L+i-1;
				m[i][j] = Integer.MAX_VALUE;
				for(int k=i;k<=j-1;k++){
					int buff = m[i][k]+m[k+1][j]+arr[i-1]*arr[k]*arr[j];
					if(m[i][j]>buff){
						m[i][j] = buff;
					}
				}
			}
		}
		return m[1][len-1];
	}

}
