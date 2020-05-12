package shape;

public abstract class Shape {
	private double size;
	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public abstract void getArea();

}
