package collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	private String name;
	
	private List db = new ArrayList();
	
	public PlayList() {
		// TODO Auto-generated constructor stub
	}

	public PlayList(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List getPlayList() {
		return db;
	}

	public void addSong(Song song) {
		
		if (song != null) {
			
			for (Object o : db) {
				
				Song s = (Song) o;
				
				if (s.equals(song)) {
					
					System.out.println("Song already added in playlist..");
					return;
				}
			}
				db.add(song);
				System.out.println("Song added to the playList..");
			
			}
		else {
			System.out.println("Invalid input");
		}
	}
	
	public void addToFav(String name)
	{
		for (Object obj : db) {
			
			Song s = (Song) obj;
			
			if (s.getName().equalsIgnoreCase(name)) {
				
				s.setFav(true);
				return;
			}
		}
		System.out.println("Song not present in playlist...!");
	}
	
	public List favSongs()
	{
		List l = new ArrayList();
		
		for (Object obj : db) {
			
			Song s = (Song) obj;
			
			if (s.isFav()) {
				
//				System.out.println(s);
				l.add(s);
				
			}

		}return l;
	}
		
}
	
	
	
	
	

