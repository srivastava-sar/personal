package Algorithm.DP;

/*
 * Minimum Jumps to reach the end of an array
 */
public class MinJumps {
	public static void main(String[] args){
		int []arr = {1,4,3,2,8,2,6,7,6,10};
		int jump=1;
		int stair=arr[0];
		int ladder = arr[0];
		for(int level=1;level<arr.length;level++){
			if(level==arr.length-1){
				System.out.println("here"+jump); System.exit(1);}
			if(level+arr[level]>ladder)
				ladder = arr[level]+level;
			stair--;
			if(stair==0){
				jump++;
				stair = ladder-level;
			}
		}
		System.out.println(jump);
	}
}
