package midtermexam;

public class Tester {

	public static void main(String[] args) {
		Up up = new Up();
		UpCasting uc = new Up();
		
		Up up1 = (Up)uc;
		
		
		up.word = "Child";
		System.out.println(up.word);
		up1.word2 = "다운캐스팅";
		System.out.println(up1.word2);
	}
}
