package th8Report;

import java.util.Scanner;

public class MyException {

	public static void main(String[] args) {
		
		MyException my = new MyException();
		my.test();

	}
	public void test() {
		
		try {			
			input();
		} catch (NumberFormatException e) {
			System.out.println("Ȧ���� �ԷµǾ����ϴ�. �ٽ� ¦���� �Է��� �ּ���.");
		}
	}
	public void input () {
		
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		
		System.out.println("5���� ¦���� �Է��� �ּ���");
		
		for (int i=0; i<5; i++) {
			arr[i] = numScan(in.nextInt());			
		}	
		System.out.print("�Է¹��� 5���� ¦���� : ");
		for (int data : arr) {
			System.out.print(data + " " );
		}
		
			
	}
	
	public int numScan (int num) throws NumberFormatException {
		if (num%2 == 0) {
			return num;
		}
		else {
			throw new NumberFormatException();
		}
	}

}
