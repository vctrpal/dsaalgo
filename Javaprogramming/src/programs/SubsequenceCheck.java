package programs;

public class SubsequenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "axc";
		String t = "abcdef";
		
		System.out.println(isSubSequence(s,t));

	}
	
	
	private static boolean isSubSequence(String s,String t) {
		int i = 0;
		int j = 0;
		while(i < s.length() && j < t.length()) {
			
			if(s.charAt(i)== t.charAt(i))
				i++;
			j++;
		}
		
		if(i == s.length())
			return true;
		return false;
	}

}
