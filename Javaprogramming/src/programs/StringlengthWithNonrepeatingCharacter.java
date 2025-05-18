package programs;

import java.util.Arrays;

public class StringlengthWithNonrepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s)); 

	}
	
	
	public static int lengthOfLongestSubstring(String s) {
	    int maxlen = 0;
	    
	    for(int right = 0,left = 0; right < s.length();right++) {
	    	int lastIndexOf = s.indexOf(s.charAt(right), left);
	    	if(lastIndexOf != right) {
	    		left = lastIndexOf+1;
	    	}
	    	maxlen = Math.max(maxlen, right-left+1);
	    }
	    return maxlen;
	}


}
