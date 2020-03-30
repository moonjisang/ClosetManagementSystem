import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("화씨온도 입력 : ");
		float a = in.nextFloat();
		
		float c = (a-32)*5/9;
		
		System.out.printf("화씨온도 %f도는 섭씨온도로 %f도 입니다. ", a, c);


	}

}
