package Strings;

import java.util.Arrays;

public class RemoveVowels {
	
	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over a lazy dog";
		
		System.out.println((removeVowels(s)));
	}
	
//	public static void removeVowels(String s)
//	{
//		
//		String ans = "";
//		
//		for (int i = 0; i < s.length(); i++) {
//			
//			char ch = s.charAt(i);
//			
//			if (!(ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')) {
//				
//				ans += ch;
//			}
//			
//		}
//		System.out.println(ans);
//	}
	
	public static String removeVowels(String s)
	{
		int ct = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'I'||ch == 'O'||ch == 'U')
			{
				ct++;
			}
		}
		
		char [] ch = new char[s.length() - ct];
		
		for (int i = 0; i < ch.length; i++) {
			
			char ch1 = s.charAt(i);
			
			if (!(ch1 == 'a'||ch1 == 'e'||ch1 == 'i'||ch1 == 'o'||ch1 == 'u'||ch1 == 'A'||ch1 == 'E'||ch1 == 'I'||ch1 == 'O'||ch1 == 'U'))
			{
				ch[i] = ch1;
			}

		}
		
		String s1 = "";
		
		for (int i = 0; i < ch.length; i++) {
			
			s1 += ch[i];
			
		}return s1;
		
	}
	
}
