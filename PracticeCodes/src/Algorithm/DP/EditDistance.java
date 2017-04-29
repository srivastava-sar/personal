package Algorithm.DP;

public class EditDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "saransh";
		String str2 = "sararshss";
		int[][] table = new int[str1.length()+1][str2.length()+1];
		
		for(int i=0;i<=str1.length();i++){
			for(int j=0;j<=str2.length();j++){
				if(i==0)
					table[0][j] = j;
				else if(j==0)
					table[i][0] = i;
				else if(str1.charAt(i-1) == str2.charAt(j-1))
					table[i][j] = table[i-1][j-1];
				else
					table[i][j] = 1+Math.min(Math.min(table[i-1][j-1], table[i-1][j]), table[i][j-1]);
			}
		}
		System.out.println(table[str1.length()][str2.length()]);
	}

}
