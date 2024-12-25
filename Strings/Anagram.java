package Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "elbow";
		String s2 = "below";

		anagram(s1, s2);
		System.out.println(stringAnagram(s1,s2));
	}

	public static void anagram(String s1, String s2) {

		if (s1.length() == s2.length()) {

			int[] ct1 = new int[127];
			int[] ct2 = new int[127];

			for (int i = 0; i < s2.length(); i++) {

				char ch1 = s1.charAt(i);
				char ch2 = s2.charAt(i);

				if (ch1 >= 'a' && ch1 <= 'z') {

					ct1[ch1] += 1;
				}

				else if (ch1 >= 'A' && ch1 <= 'Z') {

					ct1[ch1 + 32] += 1;
				}

				if (ch2 >= 'a' && ch2 <= 'z') {

					ct2[ch2] += 1;
				}

				else if (ch2 >= 'A' && ch2 <= 'Z') {

					ct2[ch2 + 32] += 1;
				}
			}
//			System.out.println(Arrays.toString(ct1));
//			System.out.println(Arrays.toString(ct2));
		}

		else {
			System.out.println("Not anagram");
		}
	}

	public static boolean stringAnagram(String s1, String s2) {

		if (s1.length() == s2.length()) {

			int[] ct1 = new int[127];
			int[] ct2 = new int[127];

			for (int i = 0; i < s2.length(); i++) {
				
				ct1[s1.charAt(i)] ++;
				ct2[s2.charAt(i)] ++;
			}
			
			System.out.println(Arrays.toString(ct1));
			System.out.println(Arrays.toString(ct2));
			
			for (int i = 0; i < ct2.length; i++) {
				
				if (ct1[i] != ct2[i]) {
					
					return false;
				}
			
				
			}return true;
		}return false;

	}
}
