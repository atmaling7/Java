class Pattern19 
{
	public static void main(String[] args) 
	{
		int n=5,star=0;

		for (int i=0;i<n-1;i++)
		{
			for (int j=0;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			if (i<n/2)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
		}
		
		star=0;

		for (int i=0;i<=n;i++)
		{
			for (int j=0;j<=star;j++)
			{
				System.out.print("*"+" ");
			}
			if (i<n/2)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
		}
	}
}
