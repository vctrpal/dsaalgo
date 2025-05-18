package programs;

import java.util.Arrays;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(ifTheStringisPalindrome("geeksogeeks"));

	}
	
	public static boolean ifTheStringisPalindrome(String str) {
		int[] charArray = new int[256];
		Arrays.fill(charArray, 0);
		
		for(int i=0;i< str.length();i++) {
			charArray[(int)str.charAt(i)]++;
		}
		
		int oddCount = 0;
		for(int i=0;i < 256; i++) {
			if((charArray[i] & 1) == 1)
				++oddCount;
			if(oddCount > 1)
				return false;
		}
		
		return true;
		
	}

}
