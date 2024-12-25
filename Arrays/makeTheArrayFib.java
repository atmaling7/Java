package Arrays;

import java.util.*;

public class makeTheArrayFib {
	
	public static void main(String[] args) {
//		System.out.println(fibonacci(13));
//		System.out.println(isFibonacci(34));
		
//		System.out.println(nextFib(1));
//		System.out.println(nextFib(11));
//		System.out.println(nextFib(68));
//		System.out.println(nextFib(10));
		
		
		int [] ar = {1,11,68,2,10};
		
		makeTheArrayFibonacci(ar);
		
		System.out.println(Arrays.toString(ar));
	}
	
	public static void makeTheArrayFibonacci(int[] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			
			if(isFibonacci(ar[i]))
				continue;
			
			else {
				ar[i] = nextFib(ar[i]);
			}
		}
	}
	
	public static boolean isFibonacci(int n)
	{
		int n1 = 0, n2 = 1, n3 = 0;
		
		if(n == n1 || n == n2)
			return true;
		
		
		while(n2 < n)
		{
			n3 = n1 + n2;
			
			n1 = n2;
			
			n2 = n3;
			
		}
	return n2 == n;
		
	}
	
	public static int nextFib(int num)
	{
		int i = num + 1;
		
		for (	;	; i++)
			if(isFibonacci(i))
				return i;
	}
}
