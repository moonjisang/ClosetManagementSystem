package shape;

public class Rectangle extends Shape {

	Rectangle(int n, int m){
		double num = n*m;
		setSize(num);
	}
	
	public void getArea() {
		System.out.printf("�簢���� ũ�� : %f \n", getSize());		
	}
}