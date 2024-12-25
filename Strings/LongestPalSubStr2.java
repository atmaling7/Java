package Strings;

public class LongestPalSubStr2 {
	
	public static void main(String[] args) {
		
		String s = "bababad";
		
		System.out.println(longestPalSubStr(s));
	}
	
	public static String longestPalSubStr(String s)
	{
		int start = 0, max = 1;

	    for (int i = 0; i < s.length(); i++) {
	        int x = iterateAround(s, i, i);
	        int y = iterateAround(s, i, i + 1);
	        int len = Math.max(x, y);

	        if (len >= max) {
	            max = len;
	            start = i - (max - 1) / 2;
	        }
	    }
	    return s.substring(start, start + max);
		
	}
	
	private static int iterateAround(String s, int p, int q) {
	    while (p >= 0 && q < s.length() && s.charAt(p) == s.charAt(q)) {
	        p--;
	        q++;
	    }
	    return q - p - 1;
	}
}
