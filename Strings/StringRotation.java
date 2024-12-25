package Strings;

public class StringRotation {
	
	public static void main(String[] args) {
		
		String s = "elbow";
		
//		System.out.println(s.length());
		
//		System.out.println(removeString(s,1));
//		
//		System.out.println(rotateString(s));
		System.out.println(s);
		System.out.println(rotateLeftString(s));

	}
	
	public static String rotateString(String s)
	{
		char temp = s.charAt(0);
		
		System.out.println(temp);
		s = removeString(s, 0);
		s += temp;
				
		return s;
	}
	public static String rotateLeftString(String s)
	{
		char temp = s.charAt(s.length()-1);
		
		System.out.println(temp);
		s = removeString(s, s.length()-1);
		s = temp + s;
		
		return s;
	}
	
	public static String removeString(String s,int index)
	{
		String ans = "";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (i != index) {
				
				ans += s.charAt(i);
			}
		}return ans;
	}
}
