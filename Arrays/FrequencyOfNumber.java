package Arrays;

public class FrequencyOfNumber {
	
	public static void main(String[] args) 
	{
		int [] ar = {3,0,1,3,2,9,5,3,1,0};
		
		frequencyOfNumber(ar);
	}
	
	public static void frequencyOfNumber(int[] ar)
	{
		int [] count = new int[ar.length];
		
		for (int i = 0; i < ar.length-1; i++) 
		{
			int ct = 0; 
			
			if(count[i] != -1)
			{
				for(int j=i+1; j<ar.length;j++)
				{
					if(ar[i] == ar[j])
					{
						ct++;
						count[j] = -1;
					}
				}
				count[i] = ct;
			}
			
		}
		
		for (int i = 0; i < count.length; i++) 
		{
			if(count[i] != -1)
			{
				System.out.println(ar[i]+ " is repeated " +count[i]+ " times");
			}
		}
	}
}
