package Arrays;

import java.util.Arrays;

public class MakeArrayStrong {
		public static void main(String[] args) {
//			System.out.println(isStrong(145));
//			System.out.println(nextStrong(40585));
			
			int [] ar = {1,2,3,4,5,6};
			
			makeArrayStrong(ar);
			
			System.out.println(Arrays.toString(ar));
		}
		
		public static void makeArrayStrong(int[] ar)
		{
			for (int i = 0; i < ar.length; i++) {
				
				if (isStrong(ar[i])) 
				{
					continue;
				}
				else {
					ar[i] = nextStrong(ar[i]);
				}
			}
		}
		
		public static int factorial(int num)
		{
			int fact = 1;
			
			for(int i = num; i>0 ; i--)
			{
				fact = fact * i;
			}
			
			return fact;
		}
		
		public static boolean isStrong(int num)
		{
			int sum = 0;
			
			int temp = num;
			
			while(num != 0)
			{
			int rem = num % 10;
				
				sum = sum + factorial(rem);  //sum = sum + factorial(num%10)
				
				num /= 10;
			}
			
			return sum == temp;
		}
		
		public static int nextStrong(int num)
		{
		int i = num + 1;
			
			for(	;	;i++)
			{
				if(isStrong(i))
					return i;
			}
		}
}
