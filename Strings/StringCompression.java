package Strings;

import java.util.Arrays;

public class StringCompression {
	
	public static void main(String[] args) {
		
		String s = "aaabbccddde";
		
		frequency(s);
		System.out.println(frequency(s));
		System.out.println(stringCompression(s));
	}
	
	public static String stringCompression(String s)
	{
		int [] ar = new int[26];
		
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			String s1 = Utility2.ignoreCase(s);
			
			char ch = s1.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				
				ar[ch - 97]++;
			}
		}
		System.out.println(Arrays.toString(ar));
		
		for (int i = 0; i < s.length()-1; i++) {

			if (s.charAt(i) != s.charAt(i+1)) {

				ans += s.charAt(i) + String.valueOf(ar[i]);
				
				System.out.println(String.valueOf(ar[i]));
			}
		}
		return ans;
	}
	
	public static String frequency(String s)
	{
		String ans = "";
		
		int[] count = new int[s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			
			int ct = 0;
			
			if (count[i] != -1) {
				
				for (int j = i; j < s.length(); j++) {
					
					if (s.charAt(i) == s.charAt(j)) {
						
						ct++;
						count[j] = -1;
					}
				}count[i] = ct;
			}
		}
		System.out.println(Arrays.toString(count));
		
		for (int i = 0; i < count.length; i++) {
			
			if (count[i] != -1) {
				
				ans += s.charAt(i) + String.valueOf(count[i]);
			}
		}return ans;
	}

}








































































