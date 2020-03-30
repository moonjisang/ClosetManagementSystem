import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해 주세요 :");
		double a = input.nextDouble();
		
		System.out.print("사칙연산 기호를 입력해 주세요 :");
		String x = input.next();
		
		System.out.print("두번째 숫자를 입력해 주세요 :");
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
