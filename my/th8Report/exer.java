package th8Report;

import java.util.Scanner;

public class exer {

	public static void main(String[] args) {
			
		exer ex = new exer();
		ex.test();
		
	}
	
	public void test () {
		System.out.println("put two num");
		try {
			System.out.println(calc());
		} catch (NumberFormatException e) {
			System.out.println("���ڰ� �ԷµǾ����ϴ�. ���ڸ� �Է��� �ּ���.");
		}
	}
	
	public int calc() {
		Scanner in = new Scanner(System.in);
		int x = numScan(in.nextLine());
		int y = numScan(in.nextLine());		
		int result = x+y;
		return result;
	}
	
	int numScan (String str) throws NumberFormatException {
		int num = Integer.parseInt(str);		
		return num;
	}	

}
