import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("ȭ���µ� �Է� : ");
		float a = in.nextFloat();
		
		float c = (a-32)*5/9;
		
		System.out.printf("ȭ���µ� %f���� �����µ��� %f�� �Դϴ�. ", a, c);


	}

}
