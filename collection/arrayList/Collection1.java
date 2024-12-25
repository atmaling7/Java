package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection1 {
	
	public static void main(String[] args) {
		
		List shoe = new ArrayList();
		
		shoe.add("Puma");
		shoe.add("Nike");
		shoe.add("Adidas");
		shoe.add("Sparx");
		shoe.add("Bata");
		
//		System.out.println(shoe);
		
		List fruits = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Guaua");
		fruits.add("PineApple");
		fruits.add("Chikoo");
		fruits.add("Watermelon");
		fruits.add("Dragon Fruit");
		
//		System.out.println(fruits);
		
		List shop = new ArrayList();
		
//		shop.add(shoe);
//		shop.add(fruits);
		
		shop.addAll(shoe);
		shop.addAll(fruits);

		System.out.println(shop);
		
//		if (shop.contains("Banana")) {
//			
//			shop.remove("Banana");
//			
//		} else {
//			
//			System.out.println("Element not found");
//
//		}
		
//		if (shop.containsAll(fruits)) {
//			
//			shop.retainAll(fruits);
//			
//		} else {
			
//			System.out.println("Collection not found");
//		}
		
//		System.out.println(shop.isEmpty());
		
//		System.out.println(Arrays.toString(shop.toArray()));
		
//		System.out.println(shop.size());
		
		System.out.println(shop.hashCode());
//		System.out.println(shop);
		
//		shop.iterator();
		
		for (Object object : shop) {
			
			System.out.println(object);
		}
		

	}
}
