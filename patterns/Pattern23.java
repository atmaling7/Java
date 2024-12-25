import java.util.Scanner;
class Pattern23 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the n value");
		int n = s.nextInt();

		for (int i=0;i<=n/2;i++)
		{
			for (int space=0;space<i;space++)
			{
				System.out.print(" ");
			}
			for (int star=0;star<n-2*i;star++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
