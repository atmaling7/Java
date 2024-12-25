package collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ShoeDriver {
	
	public static void main(String[] args) {
		
		List<Shoe> shoe = new ArrayList<Shoe>();
		
		shoe.add(new Shoe("Puma", 8, 2000.00, "Black", "sports"));
		shoe.add(new Shoe("Adidas", 9, 3000.00, "Black", "running"));
		shoe.add(new Shoe("Nike", 10, 4500.00, "Black", "sports"));
		shoe.add(new Shoe("Bata", 7, 2000.00, "Brown", "formal"));
		shoe.add(new Shoe("Campus", 5, 700.00, "White", "sports"));
		shoe.add(new Shoe("Red Tape", 9, 2500.00, "Black", "sports"));
		shoe.add(new Shoe("Bacca Bucci", 6, 2200.00, "Black", "sports"));
		shoe.add(new Shoe("Wood Land", 8, 800.00, "White", "Casual"));
		
		
		//List iterator
		
//		ListIterator li = shoe.listIterator();
		
//		System.out.println(li);
		
//		while (li.hasNext()) {
//			
//			Shoe s = (Shoe)li.next();
//			
//			if (s.size % 2 != 0) {
//				
//				li.remove();
//			}
//		}
//		System.out.println(shoe);
		
		
		Collections.sort(shoe);
		
		System.out.println(shoe);

	}
}







































//System.out.println(shoe);

//for (Object o : shoe) {
//	
//	Shoe s = (Shoe) o;
//	
//	if (s.size % 2 != 0) {
//		
//		shoe.remove(s);//cuncurrent modification exception
//	}
//}

//Iterator i = shoe.iterator();
//
//while (i.hasNext()) {
//	
//	System.out.println(i.next());
//	
//}



//System.out.println(shoe);
