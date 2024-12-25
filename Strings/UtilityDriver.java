package Strings;

import java.util.Arrays;

public class UtilityDriver {
	
	public static void main(String[] args) {
		
		Utility1 u = new Utility1();
		
		System.out.println(Arrays.toString(u.toChar("amit")));
		System.out.println(u.toUpperCase("amit"));
		System.out.println(u.toLowerCase("AMIT"));
		System.out.println(u.sortString("AMIT"));
		System.out.println(u.palindromicString("NAMAN"));
		System.out.println(u.sum("NAMAN@123"));
		System.out.println(u.noOfWords("Hello my name is Amit"));
		u.noOfLetters("Qspiders@.12");
		
		System.out.println(u.indexOf("Atmaling", 'A'));
	}
	
	
	
	


}
