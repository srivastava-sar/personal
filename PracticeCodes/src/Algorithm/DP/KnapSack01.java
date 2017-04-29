package Algorithm.DP;

public class KnapSack01 {
	public static void main(String[] args)throws Exception{
		int val[] = {60,100,120};
		int wt[] = {10,20,30};
		int W = 50;
		int n = 3;
		System.out.println(knapSack(W,val,wt,n));
	}

	private static int knapSack(int W, int[] val, int[] wt, int N) {
		// TODO Auto-generated method stub
		int[][] k = new int[N+1][W+1];
		for(int i=0;i<=N;i++){
			for(int w=0;w<=W;w++){
				if(i==0|| w==0)
					k[i][w] = 0;
				else if(wt[i-1]>w){
					k[i][w] = k[i-1][w];
				}else{
					k[i][w] = max(val[i-1]+k[i-1][W-wt[i-1]],k[i-1][w]);
				}
			}
		}
		for(int i=0;i<N;i++){
			for(int w=0;w<W;w++){
				System.out.print(k[i][w]+"\t");
			}
			System.out.println();
		}
		return k[N][W];
	}

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return (i<j)?j:i;
	}
}
