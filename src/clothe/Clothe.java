package clothe;

import java.util.Scanner;

public class Clothe {
	protected ClotheKind kind = ClotheKind.Pants;
	protected String name;
	protected int id;
	protected String source;
	protected String price;

	public Clothe() {
	}

	public Clothe(ClotheKind kind) {
		this.kind = kind;		
	}

	public Clothe(String name, int id) {
		this.name = name;
		this.id = id;

	}

	public Clothe(String name, int id, String source, String price) {
		this.name = name;
		this.id = id;
		this.source = source;
		this.price = price;
	}

	public Clothe(ClotheKind kind, String name, int id, String source, String price) {
		this.kind = kind;
		this.name = name;
		this.id = id;
		this.source = source;
		this.price = price;
	}

	public ClotheKind getKind() {
		return kind;
	}

	public void setKind(ClotheKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Pants:
			skind = "Pts";
			break;
		case Tshirts:
			skind = "Ts";
			break;
		case Knit:
			skind = "Knt";
			break;
		case Outer:
			skind = "Ot";
			break;
		default:			
		}		 
		System.out.println("kind:" + skind + "name: " + name + " id: " + id + " source: " + source + " price: " + price);
	}

	public void getCloInput(Scanner input) {

		System.out.print("Clothe ID :");
		int id = input.nextInt();		
		this.setId(id);

		System.out.print("Clothe name :");
		String name = input.next();		
		this.setName(name);

		System.out.print("Clothe Source :");
		String source = input.next();
		this.setSource(source);

		System.out.print("Clothe price :");
		String price = input.next();
		this.setPrice(price);
	}
}

