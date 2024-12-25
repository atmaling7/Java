package Strings;

public class ReverseWordsOfString {
	
	public static void main(String[] args) {
		
		String str = "Java is fun";
		
		System.out.println(reverseString(str));
	}
	
	public static String reverseString(String s)
	{
		String[] s1 = s.split(" ");
		
		String ans = "";
		
		for (int i = s1.length-1; i >= 0; i--) {

			ans += s1[i] + " ";
		}
		
		return ans;
	}
}
