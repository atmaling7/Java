package collection.arrayList;

public class Song {

	private String name;
	private String singer;
	private String movie;
	private String lyrics;
	private String genre;
	private boolean fav;
	
	public Song() {
		// TODO Auto-generated constructor stub
	}

	public Song(String name, String singer, String movie, String lyrics, String genre) {
		super();
		this.name = name;
		this.singer = singer;
		this.movie = movie;
		this.lyrics = lyrics;
		this.genre = genre;
	}
	
	public String getName() {
		return name;
	}

	public String getSinger() {
		return singer;
	}

	public String getMovie() {
		return movie;
	}

	public String getLyrics() {
		return lyrics;
	}

	public String getGenre() {
		return genre;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public void setLyrics(String lyrics) {
		this.lyrics = lyrics;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", singer=" + singer + ", lyrics=" + lyrics +"]";
	}
	
	public boolean equals(Object o)
	{
		Song s = (Song) o;
		
		if (o==null) {
			return false;
		}
		
		else if(this.name.equals(s.name) && this.movie.equals(s.movie) && this.singer.equals(s.singer) &&this.lyrics.equals(s.lyrics) && this.genre.equals(s.genre))
		{
			return true;
		}
		return false;
	}
	
	public int hashCode()
	{
		return name.hashCode()+singer.hashCode()+lyrics.hashCode()+genre.hashCode()+movie.hashCode();
	}

	public boolean isFav() {
		return fav;
	}

	public void setFav(boolean fav) {
		this.fav = fav;
		
		System.out.println("Song "+getName()+" added to favourites");
	}

}
