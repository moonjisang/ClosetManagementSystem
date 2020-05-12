package shape;

public class Triangle extends Shape {

	Triangle(int n, int m){
		double num = n*m/2;
		setSize(num);
	}
	
	public void getArea() {
		System.out.printf("삼각형의 크기 : %f \n", getSize());		
	}
}