
public class Clothe {


	String name;
	int id;
	String source;
	String price;
	
	public Clothe() {
	}
	
	public Clothe(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Clothe(String name, int id, String source, String price) {
		super();
		this.name = name;
		this.id = id;
		this.source = source;
		this.price = price;
	}

	public void printInfo() {
		System.out.println("name: " + name + " id: " + id + " source: " + source + " price: " + price);
	}
}
