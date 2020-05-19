package clothe;

import java.util.Scanner;

import exception.SourceFormatException;

public abstract class Clothe implements ClotheInput {
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

	public void setSource(String source) throws SourceFormatException {
		if (!source.contains("from") && !source.equals("")) {
			throw new SourceFormatException();
		}
		
		this.source = source;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public abstract void printInfo();
	
	public void setClotheID(Scanner input) {
		System.out.print("Clothe ID :");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setClotheName(Scanner input) {
		System.out.print("Clothe name :");
		String name = input.next();
		this.setName(name);
	}
	
	public void setClotheSource(Scanner input) {
		String source = "";
		while (!source.contains("from")) {
			System.out.print("Clothe Source :");
			source = input.next();
			try {
				this.setSource(source);
			} catch (SourceFormatException e) {
				System.out.println("Incorrect Source Format. put the source that contains from");
			}
		}
	}
	
	public void setClothePrice(Scanner input) {
		System.out.print("Clothe price :");
		String price = input.next();
		this.setPrice(price);
	}
	
	public String getKindString() {
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
		return skind;		
	}
}
