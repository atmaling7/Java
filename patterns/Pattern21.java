class Pattern21 
{ 
	public static void main(String[] args) 
	{
		int n=9,star=0;

		for (int i=0;i<n;i++)
		{
			for (int j=0;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			if (i<n/4 || i>=n/2)
			{
				star++;
			}
			else if(i>=(n/2/2) )
			{
				star--;
			}
			else if (i>(n/2+n/2/2))
			{
				star-=2;
			}
			
			System.out.println();
		}
	}
}
