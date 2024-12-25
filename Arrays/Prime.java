package Arrays;

public class Prime {
	
	public static void main(String[] args) {
//		System.out.println(isPrime(23));
//		System.out.println(nextPrime(13));
		
//		System.out.println(isFib(13));
		
		System.out.println(nextFib(13));
		System.out.println(isFib(11));
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		
		for(	;den<=num/2;den++)
		{
			if(num%den == 0)
				return false;
		}
		return true;
	}
	
	public static int nextPrime(int num)
	{
		if(!(isPrime(num)))
		{
			while(true)
			{
				num++;
				
				if(isPrime(num))
					return num;
			}
		}
		else {
			return num;
		}
	}
	
	public static boolean isFib(int num)
	{
		int n1=0,n2=1,n3;
		
		while(num>=n1)
		{
			if(num == n1)
				return true;
			
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
		}
		return false;
	}
	
	public static int nextFib(int num)
	{
		if(!(isFib(num)))
		{
			while(true)
			{
				num++;
				
				if(isFib(num))
					return num;
			}
		}
		return num;
	}
}
