package midtermexam;

public class Field {
	static int x;
	static String st;
	
	void print(int x, String st) {
		System.out.println(x+st);
	}
	public static void main(String[] args) {
		Field f = new Field();		
		System.out.println(x+st);
		f.print(5, "xxx");
	}
}