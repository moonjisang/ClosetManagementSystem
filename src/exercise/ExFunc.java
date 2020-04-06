package exercise;

public class ExFunc {
	static int a = 45;
	public static void increaseA() {
		a++;
	}
	public static void main(String[] args) {
		
		System.out.println("1:" + a);
		increaseA();
		System.out.println("2:" + a);
	}

}
