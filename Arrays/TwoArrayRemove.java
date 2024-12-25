package Arrays;

import java.util.*;

public class TwoArrayRemove {
	
	public static void main(String[] args) {
		
		int [] ar = {3,6,18,9,0,5,6};
		
		int [] remove = {3,-1,0,5};
		
		int[] op = removeIndex(ar,remove);
		
		System.out.println(Arrays.toString(op));
	}

	public static boolean checkIndex(int[] remove,int index)
	{
		for (int i = 0; i < remove.length; i++) {
			
			if (remove[i]==index) {
				return true;
			}
		}
		return false;
	}
	
	public static int[]  removeIndex(int[]ar,int[] remove)
	{
		int ct = 0;
		
		for (int i = 0; i < remove.length; i++) {
			
			if (remove[i]>=0 && remove[i]<ar.length) {
				
				ct++;
			}
		}
		
		if (ct>0) 
		{
			int [] ans = new int[ar.length - ct];
			
			
			for (int i = 0,j=0; i < ar.length; ) 
			{
				
				if(checkIndex(remove,i))
				{
					i++;
				}
				else {
					ans[j] = ar[i];
					i++;
					j++;
				}
			}
			return ans;
		}
		return ar;
	}
}
