package Arrays;

public class CountRepeatation {
	
	public static int countRepeat(int[] ar,int element)
	{
		int ct = 0;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i] == element) {
				ct++;
			}
		}
		return ct;
	}
	
	public static void main(String[] args) {
		
		int [] ar = {1,2,5,84,2};
		
		System.out.println(countRepeat(ar,10));
	}
}
