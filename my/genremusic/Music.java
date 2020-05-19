package genremusic;


public class Music {
	String song1;
	String name1;

	

	//노래 이름 저장, 리턴
	public void setSong(String song1){
		this.song1 = song1;
	}
	public String getSong(){
		return this.song1;
	}

//작곡가 이름 저장, 리턴
	public void setName(String name1){
		this.name1 = name1;
	}
	public String getName(){
		return this.name1;
	}
	public void printPlaydata() {
		System.out.println(song1 + " of " + name1);
	}

	
}
