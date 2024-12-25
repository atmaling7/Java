package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SongDriver {
	
	public static void main(String[] args) {
		
		List db = new ArrayList();
		
		db.add(new Song("Tum Hi Ho","Arijit Singh","Aashiqui 2","Mithoon","Romantic"));
		db.add(new Song("Channa Mereya","Arijit Singh","Ae Dil Hai Mushkil","Amitabh Bhattacharya","Romantic"));
		db.add(new Song("Gerua","Arijit Singh","Dilwale","Amitabh Bhattacharya","Romantic"));
		db.add(new Song("Sun Saathiya","Priya Saraiya, Divya Kumar","ABCD 2","Priya Saraiya","Dance/Pop"));
		db.add(new Song("Jeene Laga Hoon","Atif Aslam, Shreya Ghoshal","Ramaiya Vastavaiya","Priya Panchal","Romantic"));
		db.add(new Song("Tera Ban Jaunga","Akhil Sachdeva, Tulsi Kumar","Kabir Singh","Kumaar","Romantic"));
		db.add(new Song("Tera Ban Jaunga","Akhil Sachdeva, Tulsi Kumar","Kabir Singh","Kumaar","Romantic"));
		db.add(new Song("Tera Yaar Hoon Main","Arijit Singh","Sonu Ke Titu Ki Sweety","Kumaar","Friendship/Emotional"));
		db.add(new Song("Raabta","Arijit Singh","Agent Vinod","Amitabh Bhattacharya","Romantic"));
		db.add(new Song("Tujh Mein Rab Dikhta Hai","Roop Kumar Rathod","Rab Ne Bana Di Jodi","Jaideep Sahni","Romantic"));
		db.add(new Song("Hasi Ban Gaye","Ami Mishra, Shreya Ghoshal","Hamari Adhuri Kahani","Kunaal Vermaa","Romantic"));
		db.add(new Song("Pee Loon","Mohit Chauhan","Once Upon a Time in Mumbaai","Irshad Kamil","Romantic"));
		db.add(new Song("Phir Le Aya Dil","Arijit Singh","Barfi!","Sayeed Quadri","Ghazal/Emotional"));
		
		for (Object o : db) {
			
			System.out.println(o);
		}
	}
	
	
	
	
}
