package Arrays;

public class SecondMinArray {

	public static void main(String[] args) {
		int [] ar = {1,-3,-9,5,20,-9};
		
		secMin(ar);
	}
	
	public static void secMin(int [] ar)
	{
		int min = Integer.MAX_VALUE;
		int smin = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			if(ar[i] < min)
			{
				smin = min;
				min = ar[i];
			}
			
			else if(ar[i] < smin && ar[i] != min)
			{
				smin = ar[i];
			}
		}
		System.out.println(smin);
	}
}
