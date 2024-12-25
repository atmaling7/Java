package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SumOfNumbers {
	
	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		
		l1.add(10);
		l1.add(20);
		l1.add(true);
		l1.add(20.5f);
		l1.add(259654l);
		l1.add(100);
		l1.add("Hello");
		l1.add(50);
		l1.add('a');
		
//		System.out.println(l1);
		
//		for (Object val : l1) {
//			
//		System.out.println(val);
//		}
		
		int sum = 0;
		
		for (int i = 0; i < l1.size(); i++) {
			
			
			try {
				
				 sum += (Integer)l1.get(i);
				
			} catch (ClassCastException e) {
				// TODO: handle exception
			}
		}
		System.out.println(sum);
		
		
		List l2 = new ArrayList();
		
		for (Object var : l1) {
			
			try {
				
				l2.add((Integer)var);
				
			} catch (ClassCastException e) {
				// TODO: handle exception
			}
		}
		System.out.println(l2);
	}
}
