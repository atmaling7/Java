import java.util.Scanner;

class  Pattern8
{
	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = sc.nextInt();*/
		int n=5;

		for (int i=0;i<n ;i++)
		{
			for (int j=0;j<n; j++)
			{
				if( j==0 || i==0 ||i>=n/2 || j==n-1 && i<n/2 ||j==0 && j>=n/2 && i> n/2 || i==4 && j==3 ||i==5 && j==4 )
				{
					System.out.print("*"+" ");
				}
				else
				{
				System.out.print(" "+" ");
				}
			}
		System.out.println();
		}
	}
}
