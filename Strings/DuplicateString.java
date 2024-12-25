package Strings;

public class DuplicateString {
	
	public static void main(String[] args) {
		
		String s = "DuplicateString";
		
		System.out.println(duplicate(s));
	}
	
	public static String duplicate(String s)
	{	
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			ans += s.charAt(i);
		}
		return ans;
	}
}
