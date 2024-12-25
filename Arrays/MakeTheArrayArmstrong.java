package Arrays;

import java.util.Arrays;

public class MakeTheArrayArmstrong {
	
	public static void main(String[] args) {
		
		int [] ar = {1,2,4,10,25};
		
		makeTheArrayArmstrong(ar);
		
		System.out.println(Arrays.toString(ar));
	}
	
	public static void makeTheArrayArmstrong(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			
			if(isArmstrong(ar[i]))
				continue;
			
			else {
				ar[i] = nextArmstrong(ar[i]);
			}
		}
	}
	
	public static boolean isArmstrong(int num)
	{
		int ct = count(num);
		
		int sum = 0;
		
		int temp = num;
		
		while(num > 0)
		{
			int rem = num % 10;
			
			sum = sum + power(rem,ct);
			
			num /= 10;
		}
		
		return sum == temp;
	}
	
	public static int nextArmstrong(int num)
	{
		int i = num + 1;
		
		for(	;	;i++)
		{
			if(isArmstrong(i))
				return i;
		}
	}
	
	public static int count(int num)
	{
		int ct = 0;
		
		while(num>0)
		{
			ct++;
			num /= 10;
		}
		return ct;
	}
	
	public static int power(int base,int raise)
	{
		int pow = 1;
		
		for(int i=0; i<raise; i++)
		{
			pow = pow * base;
		}
		
		return pow;
	}
}
