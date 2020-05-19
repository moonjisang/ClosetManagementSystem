package clothe;

import java.util.Scanner;

import exception.SourceFormatException;

public class OuterClothe extends TopClothe {

	protected String approximatesource;
	protected String approximateprice;

	public OuterClothe(ClotheKind kind) {
		super(kind);		
	}
	
	public void getCloInput(Scanner input) {
		setClotheID(input);
		setClotheName(input);
		setClotheSourcewithYN(input);
		setApproximateSourcewithYN(input);		
		setClothePrice(input);
	}
	
	public void setApproximateSourcewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have a approximately Clothe Source? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					setClotheSource(input);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setSource("");
					break;
				}
				else {
				}
			}
				catch(SourceFormatException e) {
					System.out.println("Incorrect Source Format. put the source that contains from");
				}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "name: " + name + " id: " + id + " source: " + source + " price: " + price + " approximately source: " + source + " approximately price: " + price);
	}

	
	
}
