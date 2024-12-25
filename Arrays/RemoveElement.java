package Arrays;

import java.util.*;

public class RemoveElement {
	
	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,2,5};
		
//		System.out.println(countRepeat(ar,1));
		
		
		System.out.println(Arrays.toString(removeElement(ar,2)));
	}

	
	public static int[] removeElement(int []ar,int num)
	{
		int ct = countRepeat(ar,num);//1,2,3,2  2
		
		int [] ans = new int[ar.length - ct];
		
		if(ct>0)
		{
			for (int i = 0,j=0; i < ar.length; i++) {
				
				if(ar[i] != num)
				{
					ans[j] = ar[i];
					j++;
				}
				
			}
			return ans;	
		}
		return ar;
	}
	
	public static int countRepeat(int []ar, int num)
	{
		int ct = 0;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] == num)
				ct++;
		}
		
		return ct;
	}
}
