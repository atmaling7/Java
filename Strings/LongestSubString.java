package Strings;

import java.util.Arrays;

public class LongestSubString {
	
	public static void main(String[] args) {
		
		String s = "Atmaling Rameshwar Kshitij Tejas Gajanan ";
		
//		System.out.println(noOfWords(s));
		
		System.out.println(longestSubString(s));
	}
	
	public static String longestSubString(String s)
	{
		String[] s1 = s.split(" ");
		
		int max = 0;int x = 0;
		int i = 0;
		for (; i < s1.length; i++) {
			
			String str = s1[i];
			
			int count = 0;
			
			for (int j = 0; j < str.length(); j++) {
				
				count++;
				
				
				if (count > max) {
					
					max = count;
					
					x = i;
				}
			}
		}
		
		
		return s1[x];
	}
	
	public static int noOfWords(String s)
	{
		int ct = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ' ') {
				ct++;
			}
		}
		return ct+1;
	}
}

















































