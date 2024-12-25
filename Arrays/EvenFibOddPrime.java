package Arrays;

import java.util.*;

public class EvenFibOddPrime {
	
	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,5,6,7,8};
		
		EvenFibOddPrime(ar);
		
		System.out.println(Arrays.toString(ar));
	}

	public static void EvenFibOddPrime(int [] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			
			if (i % 2 == 0) {
				
				ar[i] = Utility.nextFib(ar[i]);
				
			}
			
			else {
				ar[i] = Utility.nextPrime(ar[i]);
			}
		}
	}
}
