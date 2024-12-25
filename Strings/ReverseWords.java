package Strings;

import java.util.Arrays;

public class ReverseWords {
	
	public static void main(String[] args) {
		
		String s = "I love my India";
		
		reverseWords(s);
		System.out.println(Arrays.toString(reverse2(s)));
		
	}
	
	public static void reverseWords(String s)
	{
		String [] words = s.split(" ");
		
		String ans = "";
		
//		System.out.println(Arrays.toString(words));
		
		for (int i = 0; i < words.length; i++) {
			
			words[i] = reverse(words[i]);
			
			if (i < words.length-1) {
				
				ans += words[i] + " ";
			}
			else {
				ans += words[i];
			}
		}
		
		System.out.println(ans);
	}
	
	public static String reverse(String s)
	{
		String rev = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			rev += s.charAt(i);
		}return rev;
	}
	
	public static String[] reverse2(String s)
	{
		String [] s1 = s.split(" ");
		
		for (int i = 0,j = s1.length-1; i < j; i++,j--) {
	
			String temp = s1[i];
			
			s1[i] = s1[j];
			
			s1[j] = temp;
		}
		return s1;
	}
	
}
