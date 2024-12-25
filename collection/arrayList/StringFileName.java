package collection.arrayList;

public class StringFileName {
	
	public static void main(String[] args) {
		
		String[] s1 = {"File_1","File_310","File_$","File_value","File_123"};
		
		int max = Integer.MIN_VALUE;
		
		if(s1.length != 0)
		{
			for (int i = 0; i < s1.length; i++) {
				
				int num = 0;
				
				try {
					
					num = Integer.parseInt(s1[i].substring(5));
					
				} catch (NumberFormatException e) {
					// TODO: handle exception
				}
				
				if (num > max) {
					
					max = num;
				}
			}
			
			System.out.println(max);
		}
		else
		{
			System.out.println("-1");
		}
	}
}
