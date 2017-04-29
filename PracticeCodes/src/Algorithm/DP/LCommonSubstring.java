package Algorithm.DP;

/*
 * Given two strings S1 and S2. Find the longest common substring between S1 and S2. 
 */
public class LCommonSubstring {
	public static void main(String[] args){
		String str1 = "saransh";
		String str2 = "xaransd";
		int len1 = str1.length();
		int len2 = str2.length();
		int[][] table = new int[len1+1][len2+1];
		int result = Integer.MIN_VALUE;
		for(int i=0;i<len1;i++){
			for(int j=0;j<len2;j++){
				if(str1.charAt(i) == str2.charAt(j)){
					if(i==0 || j==0) table[i][j] = 1;
					else table[i][j] = table[i-1][j-1]+1;
				}
				if(result<table[i][j]) result = table[i][j];
			}
		}
		System.out.println(result);
			
	}
}
