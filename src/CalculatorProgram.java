import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��� �ּ��� :");
		double a = input.nextDouble();
		
		System.out.print("��Ģ���� ��ȣ�� �Է��� �ּ��� :");
		String x = input.next();
		
		System.out.print("�ι�° ���ڸ� �Է��� �ּ��� :");
		double b = input.nextDouble();
		
		switch(x) {
		case "+":
			System.out.printf("%d" + "+" + "%d" + "=" + "%d", (int)a, (int)b, (int)(a+b));
			break;
		case "-":
			System.out.printf("%d" + "-" + "%d" + "=" + "%d", (int)a, (int)b, (int)(a-b));
			break;
		case "/":
			System.out.printf("%d" + "/" + "%d" + "=" + "%f", (int)a, (int)b, a/b);
			break;
		case "*":
			System.out.printf("%d" + "*" + "%d" + "=" + "%d", (int)a, (int)b, (int)(a*b));
			break;
			
		}

	}

}
