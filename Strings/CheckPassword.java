package Strings;

import java.util.Scanner;

public class CheckPassword {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the password");
		
		String s = sc.next();
		checkPassword(s);
		
	}
	
	public static void checkPassword(String pass)
	{
		
		int ctL = 0, ctU =0, ctD = 0, ctS = 0;
		
		if (pass.length() >= 8) {
			
			for (int i = 0; i < pass.length(); i++) {
				
				char ch = pass.charAt(i);
				
//				System.out.println(ch);
				
				if (ch >= 'A' && ch <= 'Z') {
					ctU++;
					
				}
				else if (ch >= 'a' && ch <= 'z') {
					ctL++;
					
				}
				else if (ch >= '0' && ch <= '9') {
					ctD++;
					
				}
				else {
					ctS++;
					
				}
				
			}
			if (ctD > 0 && ctS >  0 && ctL > 0 && ctU > 0) {
				
				System.out.println("Your password is Strong");
			}
			
			else {
				System.out.println("Your password is weak");
			}
			
		} else {
				
			System.out.println("Password should contain atleast 8 characters");
		}
		
//		System.out.println(ctD);
//		System.out.println(ctU);
//		System.out.println(ctL);
//		System.out.println(ctS);
		
		
	}
}
