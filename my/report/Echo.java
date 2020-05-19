package report;


import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		System.out.print("입력하시오:");
		String line = input.nextLine();
		System.out.println(line);


	}

}
