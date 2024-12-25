import java.util.Scanner;

class Pattern2 
{
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		char ch = 'a';

		/*System.out.println("Enter the column number");
		int column = sc.nextInt();

			System.out.println("Enter the row number");
			int row = sc.nextInt();*/

		for (int i = 0; i< 4 ; i++)
		{

			for (int j = 0; j< 4 ; j++)
			{
				System.out.print(ch+" ");
				ch += 2;
			}
			System.out.println();
		}
	}
}
