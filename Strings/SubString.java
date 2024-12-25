package Strings;

import java.util.Scanner;

public class SubString {
	
	public static boolean checkSubString(String ip,String sub)
	{
		int i = 0,j = 0;
		
		while (i < ip.length()) {
			
			if (ip.charAt(i) == sub.charAt(j)) {
				
				while (j < sub.length() && i < ip.length()) {
					
					if (ip.charAt(i) == sub.charAt(j)) {
						
						i++;
						j++;
					}
					else {
						j = 0;
						break;
					}
				}
				
				if (j == sub.length()) {
					
					break;
				}
			}i++;
		}	
		return j == sub.length();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		
		String ip = sc.next();
		
		System.out.println("Enter the substring: ");
		
		String sub = sc.next();
		
		System.out.println(checkSubString(ip, sub));
	}
}
