package exercise;

public class OdderEven {

	public static String checkOdderEven(int x) {
		if (x % 2 == 0) {
			return "Even Num";
		}
		else {
			return "Odd Num";
		}


	}
	public static void main(String[] args) {
		System.out.println(checkOdderEven(0));

	}

}
