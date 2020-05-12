package shape;

public class Rectangle extends Shape {

	Rectangle(int n, int m){
		double num = n*m;
		setSize(num);
	}
	
	public void getArea() {
		System.out.printf("사각형의 크기 : %f \n", getSize());		
	}
}