package Strings;

import java.util.Arrays;
import java.util.Iterator;

public class StringPanagram {
	
	
	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over a lazy dog";
		
		boolean [] check = new boolean[26];
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				
				check[ch - 97] = true;
			}
			
			else if(ch >= 'A' && ch <= 'Z')
				
				check[(ch + 32) - 97] = true;
		}
		System.out.println(Arrays.toString(check));
		
		count();
		System.out.println(panagram(s));
	}
	
	public static void count() {

		String s = "The quick brown fox jumps over 99a lazy dog";

		int[] check = new int[127];

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				check[ch - 97] += 1 ;
			}

			else if (ch >= 'A' && ch <= 'Z') {

				check[(ch + 32) - 97] += 1;
			}
			
			else if (ch >= '0' && ch <= '9') {
				
				check[ch] += 1;
				
			}
		}
		System.out.println(Arrays.toString(check));
	}
	
	public static boolean panagram(String s) {

		boolean[] check = new boolean[26];

		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				check[ch - 97] = true;
			}

			else if (ch >= 'A' && ch <= 'Z')

				check[ch - 65] = true;
		}
		
		
		for (int i = 0; i < check.length; i++) {
			
			if (check[i] == false) {
				return false;
			}
			
		}return true;
		

	
	}
}
