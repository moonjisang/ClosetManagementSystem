package genremusic;

public class Tester {

	public static void main(String[] args) {
		Music m[] = new Music[3];
		GenreMusic music1 = new GenreMusic();
		GenreMusic music2 = new GenreMusic();
		GenreMusic music3 = new GenreMusic();
		
		music1.setName("Beethoven");
		music1.setSong("Destiny");
		music1.setGenre("(Symphony)");
		
		m[0] = music1;
		
		music2.setName("Handel");
		music2.setSong("Messiah");
		music2.setGenre("(Oratorio)");
		
		m[1] = music2;
		
		music3.setName("Vivaldi");
		music3.setSong("Four Seasong");
		music3.setGenre("(Concerto)");
		
		m[2] = music3;
		
		for (int i = 0; i<m.length; i++) {
			m[i].printPlaydata();
		}
	}

}
