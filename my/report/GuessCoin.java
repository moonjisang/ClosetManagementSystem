package report;
import java.util.Scanner;

public class GuessCoin {
	
	private static final String H = null;

	public static void main(String[] args) {
		double randomDouble = Math.random();
		int randomInt = (int) (randomDouble*2)+1;
		Scanner input = new Scanner(System.in);
		System.out.println("H or T?:");
		String answer = input.nextLine();
				
		
		if (answer == H) {
			int y = 1;
			if (randomInt == y) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("InCorrect!");
			}
			
		}
		else {
			int y = 2;
			if (randomInt == y) {
				System.out.println("Correct!");
			}
			else {
				System.out.println("InCorrect!");
			}
		}

		
	}

}
