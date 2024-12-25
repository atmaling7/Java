package Strings;

public class Utility2 {
	
	public static void main(String[] args) {
		
		String s = "Atmaling Hunaje";
		String s1 = "Tejus Kashyap Sir";
		
//		System.out.println(endsWith(s,"aje"));
//		System.out.println(endsWith(s1,"Sir"));
		
		System.out.println(ignoreCase(s));
		
	}

	
	public String reverse(String s)
	{
		String ans = "";
		
		for (int i = s.length()-1; i < s.length(); i++) {
			
			ans += s.charAt(i);
		}
		return ans;
	}
	
	public char[] toChar(String s) {
		// TODO Auto-generated method stub
		char ch [] = new char[s.length()];
		
		for (int i = 0; i < ch.length; i++) {
			
			ch[i] = s.charAt(i);
		}
		
		return ch;
	}
	
	
	public String toUpperCase(String s) {
		// TODO Auto-generated method stub
		
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
//			System.out.println(ch);
			
			if (ch >= 'a' && ch <= 'z') {
				
				ans += ((char)(ch - 32));
			}
			else
			{
				ans += ch;
			}
		}return ans;
	}
	
	
	
	public String toLowerCase(String s) {
		// TODO Auto-generated method stub
			
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				
				ans += (char)(ch+32);
			}
		}return ans;
		
	}
	
	
	
	public char[] sortString(String s) {
		// TODO Auto-generated method stub
		
		char [] ch = toChar(s);
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j < ch.length-1; j++) {
				
				if (ch[j] > ch[j+1]) {
					
					char temp = ch[j];
					
					ch[j] = ch[j+1];
					
					ch[j+1] = temp;
				}
			}
			
		}return ch;
	}
	
	
	
	public boolean palindromicString(String s) {
		// TODO Auto-generated method stub
		
		for (int i = 0,j = s.length()-1; i < j; i++,j--) {
			
//			char ch = s.charAt(i);
			
			if (s.charAt(i) != s.charAt(j)) {
				
				return false;
			}
		}
		return true;
	}
	
	
	public static int sum(String s)
	{
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch >= '0' && ch <= '9') {
				
				sum += (ch - 48);
			}
		}return sum;
	}
	
	public static int noOfWords(String s)
	{
		int ct = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ' ') {
				
				ct++;
			}
			
		}return ct+1;
	}
	
	public static void noOfLetters(String s)
	{
		int ctL = 0, ctU =0, ctD = 0, ctS = 0;
		
		for (int i = 0; i < s.length(); i++) {
	
			char ch = s.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') 
				
				ctL++;
			
			else if(ch >= 'A' && ch <= 'Z')
				
				ctU++;
			
			else if (ch >= '0' && ch <= '9') 
				
				ctD++;
			
			
			else {
				ctS++;
			}
		}
		
//		System.out.println("No of Lowercase Characters: " +ctL);
//		System.out.println("No of Uppercase Characters: " +ctU);
//		System.out.println("No of Digits Characters: " +ctD);
//		System.out.println("No of Special Characters Characters: " +ctS);
	}
	
	public  int indexOf(String s,char ch)
	{
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) == ch) {
				
				return i;
			}
		}return -1;
	}
	
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
	
	public static String ignoreCase(String s)
	{
		
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch >= 'A' && ch <= 'Z') {
				
				ans +=  ((char)(ch + 32));
			}
			
			else if (ch >= 'a' && ch <= 'z') {
				
				ans += ch;
			}
		}return ans;
	}
	
	
	
}
