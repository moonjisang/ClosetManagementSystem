package shapes;

public class Tester {

	public static void main(String[] args) {
		Shape [] shapes = new Shape[4];
		shapes[0] = new Shape();
		shapes[1] = new Triangle();
		shapes[2] = new Rectangle();
		shapes[3] = new Shape();
		Shape s = new Line();
		s.printInfo();

	}

}
