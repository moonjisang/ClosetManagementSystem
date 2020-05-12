package clothe;

import java.util.Scanner;

public class PantsClothe extends Clothe {

	public PantsClothe(ClotheKind kind) {
		super(kind);		
	}
	
	public void getCloInput(Scanner input) {
		setClotheID(input);
		setClotheName(input);
		setClotheSource(input);
		setClothePrice(input);
	}
	
	public void printInfo() {
		String skind = getKindString();	 
		System.out.println("kind:" + skind + "name: " + name + " id: " + id + " source: " + source + " price: " + price);
	}
	
}
