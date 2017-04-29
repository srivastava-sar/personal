package Algorithm.DP;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		int m = arr.length;
		int n = 2;
		System.out.println("Count = "+count(arr,m,n));
	}

	// n is the sum
	private static int count(int[] arr, int m, int n) {
		// TODO Auto-generated method stub
		int[][] table = new int[n+1][m];
		// if n=0
		for(int i=0;i<m;i++)
			table[0][i] = 1;
		for(int i=1;i<=n;i++){
			for(int j=0;j<m;j++){
				int x = (i-arr[j]>=0)?table[i-arr[j]][j]:0; //including jth number if arr[j]<i
				int y = (j>=1)? table[i][j-1]:0; //excluding the jth number
				table[i][j] = x+y;
			}
		}
		
		return table[n][m-1];
	}

}
