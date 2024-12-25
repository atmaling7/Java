package Arrays;

public class SecondMaxArray {
	
	public static void main(String[] args) {
		int[] ar = {-96,1,0 ,21,8,2,21};
		
		secMaxArray(ar);
	}
	
	public static void secMaxArray(int [] ar)
	{
		int max = Integer.MIN_VALUE;
		int s_max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i] > max) {
				s_max = max;
				max = ar[i];
			}
			
			else if (ar[i] > s_max && ar[i] != max) {
				s_max = ar[i];
			}
		}
		System.out.println(s_max);
	}
}
