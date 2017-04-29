package Algorithm.DP;

/*
 * Given a matrix of dimensions mxn having all entries as 1 or 0, find out the size of maximum size square sub-matrix with all 1s. 
 */

public class SquareMatrix1 {
	public static void main(String[] args){
		int[][] matrix = {{0,1,1,0,1,1},
				  {1,1,0,1,1,1},
				  {0,1,1,1,1,0},
				  {1,1,1,1,1,0},
				  {1,1,0,1,1,0},
				  {1,1,1,1,1,0},
				  {0,1,1,1,0,1}};
int row=7,col=6;
int[][] table = new int[row+1][col+1];
for(int i=0;i<row;i++)
	table[i][0] = matrix[i][0];
for(int j=0;j<col;j++)
	table[0][j] = matrix[0][j];

int result = Integer.MIN_VALUE;
for(int i=1;i<row;i++){
	for(int j=1;j<col;j++){
		if(matrix[i][j] == 0)
			table[i][j] = 0;
		else{
			table[i][j] = min(table[i-1][j-1],table[i-1][j],table[i][j-1])+1;
		}
		if(result<table[i][j]) result = table[i][j];
	}
}
System.out.println(result);

	}

	private static int min(int i, int j, int k) {
		// TODO Auto-generated method stub
		if(i<j){
			if(i<k)
				return i;
			else
				return k;
		}else{
			if(j<k)
				return j;
			else
				return k;
		}
	}
}
