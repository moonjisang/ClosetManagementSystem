package exercise;

import java.util.Scanner;

public class CircleDimension {

	public static void main(String[] args) {
		System.out.print("������ ���� :");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		double result = Math.PI * radius * radius;
		System.out.printf("���̴� : %f", result);

	}

}
