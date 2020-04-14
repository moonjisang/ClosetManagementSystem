package exercise;

public class ExFunc {
	public static void main(String[] args) {
		
		Increment inc = new Increment();
		
		inc.a = 45;
		System.out.println("1:" + inc.a);
		inc.increaseA();
		System.out.println("2:" + inc.a);
	}

}
