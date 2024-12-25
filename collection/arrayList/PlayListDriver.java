package collection.arrayList;

import java.util.List;

public class PlayListDriver {
	
	public static void main(String[] args) {
		
		PlayList p1 = new PlayList("My Favourites..");
		
		p1.addSong(new Song("Tum Hi Ho","Arijit Singh","Aashiqui 2","Mithoon","Romantic"));
		p1.addSong(new Song("Channa Mereya","Arijit Singh","Ae Dil Hai Mushkil","Amitabh Bhattacharya","Romantic"));
		p1.addSong(new Song("Gerua","Arijit Singh","Dilwale","Amitabh Bhattacharya","Romantic"));
		p1.addSong(new Song("Sun Saathiya","Priya Saraiya, Divya Kumar","ABCD 2","Priya Saraiya","Dance/Pop"));
		p1.addSong(new Song("Jeene Laga Hoon","Atif Aslam, Shreya Ghoshal","Ramaiya Vastavaiya","Priya Panchal","Romantic"));
		p1.addSong(new Song("Tera Ban Jaunga","Akhil Sachdeva, Tulsi Kumar","Kabir Singh","Kumaar","Romantic"));
//		p1.addSong(new Song());
		p1.addSong(new Song("Tera Yaar Hoon Main","Arijit Singh","Sonu Ke Titu Ki Sweety","Kumaar","Friendship/Emotional"));
		p1.addSong(new Song("Raabta","Arijit Singh","Agent Vinod","Amitabh Bhattacharya","Romantic"));
		p1.addSong(new Song("Tujh Mein Rab Dikhta Hai","Roop Kumar Rathod","Rab Ne Bana Di Jodi","Jaideep Sahni","Romantic"));
		p1.addSong(new Song("Hasi Ban Gaye","Ami Mishra, Shreya Ghoshal","Hamari Adhuri Kahani","Kunaal Vermaa","Romantic"));
		p1.addSong(new Song("Pee Loon","Mohit Chauhan","Once Upon a Time in Mumbaai","Irshad Kamil","Romantic"));
		p1.addSong(new Song("Phir Le Aya Dil","Arijit Singh","Barfi!","Sayeed Quadri","Ghazal/Emotional"));
		
		
		System.out.println(p1.getName());
		
		p1.addToFav("Raabta");
		p1.addToFav("Pee Loon");
		p1.addToFav("Gerua");
		
		System.out.println(p1.favSongs());
	}
}
