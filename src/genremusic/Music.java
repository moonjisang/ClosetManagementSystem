package genremusic;


public class Music {
	String song1;
	String name1;

	

	//�뷡 �̸� ����, ����
	public void setSong(String song1){
		this.song1 = song1;
	}
	public String getSong(){
		return this.song1;
	}

//�۰ �̸� ����, ����
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
