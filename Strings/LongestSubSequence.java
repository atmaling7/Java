package Strings;

public class LongestSubSequence {
	
	public static void longestSubSequence(String s)
	{
		int max = 0, ct = 0,index = 0;
		
		char ch = 0;
		
		for (int i = 0; i < s.length()-1; i++) {
			
			if (s.charAt(i) == s.charAt(i+1)) {
				
				ct++;
			}
			else {
				
				if (ct > max) {
					
					max = ct;
					ch = s.charAt(i);
					index = i - max;
				}
				ct = 0;
			}
		}
		System.out.println(ch+" is repeated for "+(max+1)+" times");
		System.out.println(s.substring(index, index + max+1));
	}
	
	public static void main(String[] args) {
		
		String s = "aabbccccd";
		
		longestSubSequence(s);
	}
	
	
}
