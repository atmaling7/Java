package Arrays;

public class MaxOfArray {
	
	public static void main(String[] args) {
		
//		int [] ar = {1,2,14,3,4,-8,10};
		
		int [] ar = {-5,-2,0,-8,-10};
		
//		int [] ar = { };
		
		System.out.println(maxOfArray(ar));
	}
	
	public static int maxOfArray(int [] ar)
	{
//		int max = Integer.MIN_VALUE; //
		
		int i = 0;
		int max = ar[i];
		
		for (; i < ar.length; i++) {
			
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}
	
}
