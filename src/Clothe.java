
public class Clothe {


	String name;
	int id;
	String source;
	String price;
	static int numClothesRegistered = 0;
	
	public Clothe() {
		numClothesRegistered++;
	}
	
	public Clothe(String name, int id) {
		this.name = name;
		this.id = id;
		numClothesRegistered++;
	}
	
	public Clothe(String name, int id, String source, String price) {
		super();
		this.name = name;
		this.id = id;
		this.source = source;
		this.price = price;
		numClothesRegistered++;
	}

	public void printInfo() {
		System.out.println("name: " + name + " id: " + id + " source: " + source + " price: " + price);
	}
}
