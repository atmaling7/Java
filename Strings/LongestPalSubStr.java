package Strings;

public class LongestPalSubStr {
	
	public static void main(String[] args)
	{
//		String s = "babad";//b a b a d
//		
//		System.out.println(putSpace(s));
//		
//		System.out.println(longestPalSubString(s));
//	}
//	
//	public static String putSpace(String s)
//	{
//		String s1 = String.valueOf((s.charAt(0)));
//		
//		for (int i = 1; i < s.length(); i++) {
//			
//			s1 += " "+s.charAt(i);
//		}
//		return s1;
//	}
//	
//	public static String longestPalSubString(String s)
//	{
//		int max = 0, p = 0, q = 0,x = 0,y = 0;
//		
//		String s1 = putSpace(s);
//		
//		for (int i = 0; i < s.length()-1; i++) {
//			
//			p = i-1;
//			q = i+1;
//			
//			while ((p >= 0 && q < s.length()) && s.charAt(p) == s.charAt(q)) {
//
//				p--;
//				q++;
//			}
//			
//			if (i-p > 1) {
//
//				if(q-p + 1 > max)
//				{
//					max = q-p+1;
//					
//					x = p;
//					y = q;
//				}
//			}
//		}
//		
//		String ans = "";
//		
//		for (int i = x+1; i < y+1; i++) {
//			
//			if (s1.charAt(i) != ' ') {
//				
//				ans += s1.charAt(i);
//			}
//		}
//		return ans;
//	}
//}


		String s = "forgeeksskeegfor";
//		System.out.println(addSpaces(s));
		longestPalSub(s);
	}
	
	public static void longestPalSub(String s)
	{
		String temp = addSpaces(s);
		int max=0,x=0,y=0,i=0,j=0;
		
		for (int k = 1; k < temp.length()-1; k++)
		{
			i=k-1;
			j=k+1;
			
			while((i>=0 && j<=temp.length()-1) && temp.charAt(i)==temp.charAt(j)) 
			{
				i--;
				j++;
			}
			
			if (k-i>1) {
				
				if (j-i+1>max) {
					max=j-i+1;
					x=i;y=j;
				}
			}
			
		}
		
		String ans="";
		for(int n=x+1; n<y;n++)
		{
			if (temp.charAt(n)!=' ')
			{
				ans+=temp.charAt(n);
			}
		}
		System.out.println(ans);
		
	}
	
	public static String addSpaces(String s)
	{
		String sp="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(i==s.length()-1)
			{
				sp+=s.charAt(i);
				continue;
			}
			sp+=s.charAt(i)+" ";
		}
		
		return sp;
	}

}
