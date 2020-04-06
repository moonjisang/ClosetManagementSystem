package exercise;

public class Square {

	public static int square(int y) {
		System.out.println("s1: " + y);
		y = y*y;
		System.out.println("s2: " + y);
		return y;
	}

	public static void main(String[] args) {
		int x = 5;
		System.out.println("m1: " + x);
		x = square(x);
		System.out.println("m2: " + x);

	}

}
