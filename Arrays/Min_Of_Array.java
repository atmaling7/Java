package Arrays;

public class Min_Of_Array {
	
	public static void main(String[] args) {
		int [] ar = {-2147483648,2,-5,4,-29,2147483647};
		
		minOfArray(ar);
		
	}
	
	public static void minOfArray(int[] ar)
	{
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i] < min) {
				min = ar[i];
			}
		}
		System.out.println(min);
	}
}
