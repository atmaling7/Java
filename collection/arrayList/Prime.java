package collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Prime {
	
	public static void main(String[] args) {
		
		List nums = new ArrayList();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(5);
		nums.add(7);
		nums.add(9);
		nums.add(10);
		
//		System.out.println(nums);
		
		List l2 = new ArrayList();
		
		ListIterator li = nums.listIterator();
		
		System.out.println(li.next());
	
		while (li.hasNext()) {
			
			int num = (Integer)li.next();
			
			if (isPrime(num)) {
				
				l2.add(num);
				li.remove();
			}
			
		}
		System.out.println(nums);
		System.out.println(l2);
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		
		for (; den < num/2; den++) {
			
			if (num % den == 0) {
				
				return false;
			}
		}return true;
	}
}
