package collection.arrayList;

public class Shoe implements Comparable<Shoe>{
	
	String brand;
	int size;
	double price;
	String color;
	String type;
	
	public Shoe() {
		// TODO Auto-generated constructor stub
	}

	public Shoe(String brand, int size, double price, String color, String type) {
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

	@Override
	public int compareTo(Shoe o) {
		
		if (this.brand.compareToIgnoreCase(o.brand) > 0) {
			return 1;
		}
		
		else if (this.brand.compareToIgnoreCase(o.brand) < 1) {
			return -1;
		}
		
		return 0;
	}
	
	Comparable<Shoe> shoe = new Comparable<Shoe>() {
		
		@Override
		public int compareTo(Shoe o) {
			// TODO Auto-generated method stub
			return 0;
		}
	};

//	@Override
//	public int compareTo(Shoe o) {
//		
//		if (this.price > o.price) {
//			return 1;
//		}
//		else if(this.price < o.price)
//		{
//			return -1;
//		}
//		return 0;
//		
//		
//		
//		return (this.price>o.price)? 1 :(this.price==o.price? 0 : -1);
//		
//	}
	
	
	
	
}
