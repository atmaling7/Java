package Strings;

import java.util.Scanner;

public class EndsWith {
	
	 static Scanner sc = new Scanner(System.in);
	 
	 public static void main(String[] args) {
		
//		 String [] ar = {"com","in","org","net","co","edu","gov","biz","info"};
//		 
////		 endsWith(ar);
//		 
//		 System.out.println(toLowerCase("HELLO"));
		 
		 char [] ch = {'A','t','m','a','l','i','n','g'};
		 
		 System.out.println(charToString(ch));
		 
	}
	
//	public static void endsWith(String[] ar,String s)
//	{	
//		
//		for (int i = ; i < .length; i++) {
//			
//		}
//		
//		for (int i = 0; i < ar.length; i++) {
//			
//			if (ip1 == ar[i]) {
//				
//				switch(ip1) {
//				
//				case "com":
//				{
//					System.out.println("Your web site is of commercial domain");
//				}
//				
//				case "in":
//				{
//					System.out.println("Your website is used for India");
//				}
//				
//				case "org":
//				{
//					System.out.println("Your domain is about organization");
//				}
//				
//				case "co":
//				{
//					System.out.println("Your domain is about company");
//				}
//				
//				case "net":
//				{
//					System.out.println("Your domain is about networks");
//				}
//				case "edu":
//				{
//					System.out.println("Your domain is about education");
//				}
//				
//				case "gov":
//				{
//					System.out.println("Your domain is about government");
//				}
//				
//				}
//				
//			}
//			
//		}
//		
//			System.out.println("Your website is not a valid domain");
//		
//		
//		
//		
//	}
	
//	public static boolean endsWith(String s)
//	{
//		
//	}
	
	public static String charToString(char[] ar)
	{
		String s = "";
		
		for (int i = 0; i < ar.length; i++) {
			
			s += String.valueOf(ar[i]);
		}
		return s;
	}
	
	public static boolean endsWith(String s,String s1)
	{
		for (int i = s.length()-1,j = s1.length()-1; j >= 0; i--,j--) {
			
			if (s.charAt(i) != s1.charAt(j)) {
				
				return false;
			}
			
		}return true;
	}
	
	public static String toLowerCase(String s)
	{
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				
				ans += (char)(ch + 32);
			}
		}return ans;
	}
}
