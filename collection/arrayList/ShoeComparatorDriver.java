package collection.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ShoeComparatorDriver {
	
	public static void main(String[] args) {
		
		List<Shoe> shoe = new ArrayList<>();
		
		shoe.add(new Shoe("Puma", 8, 2000.00, "Black", "sports"));
		shoe.add(new Shoe("Adidas", 9, 3000.00, "Red", "running"));
		shoe.add(new Shoe("Nike", 10, 4500.00, "Gray", "sports"));
		shoe.add(new Shoe("Bata", 7, 2000.00, "Yellow", "formal"));
		shoe.add(new Shoe("Campus", 5, 700.00, "Multi", "sports"));
		shoe.add(new Shoe("Red Tape", 9, 2500.00, "Orange", "sports"));
		shoe.add(new Shoe("Bacca Bucci", 6, 2200.00, "Green", "sports"));
		shoe.add(new Shoe("Wood Land", 8, 800.00, "White", "Casual"));
		
		System.out.println(shoe);
		
		Collections.sort(shoe);
		
		Comparator<Shoe> com2 = new Comparator<Shoe>() {
			
			@Override
			public int compare(Shoe s1,Shoe s2)
			{
				if (s1.color.compareToIgnoreCase(s2.color) > 0) {
					
					return 1;
				}
				else if (s1.color.compareToIgnoreCase(s2.color) < 0) {
					
					return -1;
				}
				return 0;
			}
		};
		Collections.sort(shoe, com2);
		
		for (Shoe s : shoe) {
			
			System.out.println(s);
		}
		
		
	}
}
