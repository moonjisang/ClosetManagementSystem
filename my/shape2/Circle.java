package shape2;

public class Circle extends MotherShape {

	Circle(int n){
		double num = n*n*3.14;
		setSize(num);
	}
	
	public void getArea() {
		System.out.printf("���� ũ�� : %f \n", getSize());		
	}
}