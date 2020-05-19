package shape;

public class Circle extends Shape {

	Circle(int n){
		double num = n*n*3.14;
		setSize(num);
	}
	
	public void getArea() {
		System.out.printf("원의 크기 : %f \n", getSize());		
	}
}