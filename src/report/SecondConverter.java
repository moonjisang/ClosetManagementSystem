package report;

public class SecondConverter {
	public static void main(String[] args) {
		//100000�ʸ� ��, �ð�, ��, ���� �����θ� ǥ��
		double day =100000.0/60/60/24;
		double hour =100000.0/60/60;
		double minute =100000.0/60;
		double second = 100000.0;
		System.out.printf("100000�ʴ� ��¥�� %f��, �ð����� %f�ð�, ������ %f��, �ʷδ� %f�� �Դϴ�. \n" , day, hour, minute, second);

		//100000�ʸ� ��ġ���� �ƴ� ������ ������ �� ����ؼ� ǥ��
		int a = 100000;
		int b = 100000/60;
		//��
		int c = 100000%60;
		//������ ��
		int d = b/60;
		//�ð�
		int e = b%60;
		//������ ��
		int f = d/24;
		//��
		int g = d%24;
		//������ �ð�

		System.out.printf("100000�ʴ� ��¥�� %d�� %d�ð� %d�� %d��, �ð����� %d�ð� %d�� %d��, ������ %d��%d��, �ʷδ� %d�� �Դϴ�. \n", 
				f, g, e, c, d, e, c, b, c, a);
		
		//100000�ʰ� 1�⺸�� ū�� Ȯ���ϱ�
		int year = 1;
		int yeartosecond = 1*365*24*60*60;
		if (a > yeartosecond) {
			System.out.printf("%d�ʴ� %d�⺸�� Ů�ϴ�.", a, year);
			
		}
		else if (a == yeartosecond){
			System.out.printf("%d�ʴ� %d��� �����ϴ�.", a, year);
		}
		else {
			System.out.printf("%d�ʴ� %d�⺸�� �۽��ϴ�.", a, year);
		}
		
	}

}
