package String;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TwoStrings {
	public static void main(String[] args)throws IOException{
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] result = new int[t];
        HashMap<Character,Integer> alphabets = null;
        
        //System.out.println(alphabets.get('s'));
        for(int test_case=0;test_case<t;test_case++){
        	alphabets = new HashMap<Character, Integer>();
        	for(int i=0;i<26;i++){
                alphabets.put((char) ('a'+i), 0);
            }
            String s1 = in.next();
            String s2 = in.next();
            for(int i=0;i<s1.length();i++){
            	alphabets.put((char)(s1.charAt(i)),alphabets.get((char)(s1.charAt(i)))+1);
            }
            for(int i=0;i<s2.length();i++){
            	if(alphabets.get((char)(s2.charAt(i))) != 0){
            		result[test_case] = 1;
            	}
            	//alphabets.put((char)(s2.charAt(i)),alphabets.get((char)(s2.charAt(i)))+1);
            }
           /* for(int i=0;i<26;i++){
            	if(alphabets.get((char)('a'+i))>1){
            		result[test_case] = 1;
            	}
            } */
        }
        for(int i=0;i<t;i++){
        	if(result[i]==1){
        		System.out.println("YES");
        	}else{
        		System.out.println("NO");
        	}
        }
        
	}
}
