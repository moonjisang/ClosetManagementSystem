package shape2;

public class Triangle extends MotherShape {

	Triangle(int n, int m){
		double num = n*m/2;
		setSize(num);
	}
	
	public void getArea() {
		System.out.printf("�ﰢ���� ũ�� : %f \n", getSize());		
	}
}