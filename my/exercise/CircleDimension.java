package exercise;

import java.util.Scanner;

public class CircleDimension {

	public static void main(String[] args) {
		System.out.print("반지름 기입 :");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		double result = Math.PI * radius * radius;
		System.out.printf("넓이는 : %f", result);

	}

}
