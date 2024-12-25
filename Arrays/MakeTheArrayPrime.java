package Arrays;

import java.util.Arrays;

public class MakeTheArrayPrime {

	public static void main(String[] args) {
		
//		System.out.println(nextPrime(20));
		
		int [] ar = {2,4,6,20};
		
		makeTheArrayPrime(ar);
		
		System.out.println(Arrays.toString(ar));
		
	}
	
	public static void makeTheArrayPrime(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			
			if(isPrime(ar[i]))
				continue;
			
			else {
				ar[i] = nextPrime(ar[i]);
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		 
		for(	;den<=num/2; den++)
		{
			if(num % den == 0)
				return false;
		}
		
		return true;
	}
	
	public static int nextPrime(int num)
	{
		int i = num + 1;
		
		for(	;	;i++)
		{
			if(isPrime(i))
			{
				return i;
			}
		}
	}
}
