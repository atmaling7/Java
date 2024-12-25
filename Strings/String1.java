package Strings;

import java.util.Arrays;
import java.util.Iterator;

public class String1 {
	
	public static void main(String[] args) {
		
		asciiStr("Amit Hunaje");
		asciiString("Atmaling Hunaje");
	}
	
	public static void asciiStr(String s1) {
		
//		String s1 = "Amit Hunaje";
		
		String ans = "";
		
		System.out.println(Arrays.toString(s1.getBytes()));
		System.out.println(s1.charAt(0));
		
		for (int i = 0; i < s1.getBytes().length; i++) {
			
			if (s1.getBytes()[i] % 2 == 0) {
				
				ans += s1.charAt(i);
//				System.out.println(s1);
			}
		}
		System.out.println(ans);
	}
	
	public static void asciiString(String s1)
	{
//		String s1 = "Atmaling Hunaje";
		
		System.out.println(Arrays.toString(s1.getBytes()));
		
		String ans = "";
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.charAt(i) % 2 == 0) {
				
				ans += s1.charAt(i);
			}
		}System.out.println(ans);
	}
}
