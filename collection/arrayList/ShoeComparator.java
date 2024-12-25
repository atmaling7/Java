package collection.arrayList;

import java.util.Comparator;

public class ShoeComparator  {
	

	String brand;
	int size;
	double price;
	String color;
	String type;
	
	public ShoeComparator() {
		// TODO Auto-generated constructor stub
	}

	public ShoeComparator(String brand, int size, double price, String color, String type) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "brand=" + brand + ", size=" + size + ", price=" + price + ", color=" + color + ", type=" + type
				+ "";
	}
	

	Comparator<Shoe> com1 = new Comparator<Shoe>() {
		
		@Override
		public int compare(Shoe o1, Shoe o2) {
			
			if (o1.brand.compareToIgnoreCase(o2.brand) > 0) {
				return 1;
			}
			else if (o1.brand.compareToIgnoreCase(o2.brand) < 0) {
				return -1;
			}
			return 0;
		}
	};
	
}
