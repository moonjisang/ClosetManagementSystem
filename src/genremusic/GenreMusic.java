package genremusic;

public class GenreMusic extends Music {
	
	String genre;
	
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void printPlaydata() {
		System.out.println(song1 + " of " + name1 + genre);
	}

}
