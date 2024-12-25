package Arrays;

import java.util.Iterator;

public class LinearSearch {

	public static void main(String[] args) {
		int [] ar = {1,2,3,4,5,6};
		
		int search = 10;
		
		int i = 0;
		for ( 	; i < ar.length; i++)
		{
			if (ar[i] == search)
			{
				break;
			}
		}
		
		if (i == ar.length) {
			System.out.println("Element not found");
		}
		
		else
			{
			System.out.println("Element found at index "+i);
			}
	}
	
}
