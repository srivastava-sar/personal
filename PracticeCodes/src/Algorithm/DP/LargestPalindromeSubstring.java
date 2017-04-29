package Algorithm.DP;

public class LargestPalindromeSubstring {
	public static void main(String[] args){
		
		String str = "abbfbbafabbf";
		System.out.println(longestPalStr(str));
	}

	private static String longestPalStr(String str) {
		// TODO Auto-generated method stub
		int n = str.length();
		if (n==0) return "";
		String longest = str.substring(0, 1);
		for(int i=0;i<n-1;i++){
			String p1 = expandArCentre(str,i,i);
			if(p1.length()>longest.length())
				longest = p1;
			String p2 = expandArCentre(str,i,i+1);
			if(p2.length()>longest.length())
				longest = p2;
		}
		return longest;
	}

	private static String expandArCentre(String str, int i, int i2) {
		// TODO Auto-generated method stub
		int l = i;
		int r = i2;
		int n = str.length();
		while(l>=0 && r<=n-1 && str.charAt(l) == str.charAt(r)){
			l--;
			r++;
		}
			
		return str.substring(l+1,r);
	}
}
