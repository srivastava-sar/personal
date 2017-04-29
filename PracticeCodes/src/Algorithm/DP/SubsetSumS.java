package Algorithm.DP;
//Detect if a subset from a given set of N non-negative integers sums upto a given value S

public class SubsetSumS {
	public static void main(String[] args){
		int[] set = {1,3,9,2};
		int sum = 11;
		int n = 4;
		boolean table[][] = new boolean[n+1][sum+1];
		for(int i=0;i<=sum;i++) // 0 subset 
			table[0][i] = false;
		for(int i=0;i<=n;i++)
			table[i][0] = true; //if sum is zero all subset satisfy
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sum;j++){
				table[i][j] = table[i-1][j];
				if(j>=set[i-1])
					table[i][j] = table[i][j] || table[i-1][j-set[i-1]];
			}
		}
		System.out.println(table[n][sum]);
		
		
	}
}
