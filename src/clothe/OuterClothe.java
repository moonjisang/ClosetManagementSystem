package clothe;

import java.util.Scanner;

public class OuterClothe extends Clothe {

	protected String approximatesource;
	protected String approximateprice;

	public OuterClothe(ClotheKind kind) {
		super(kind);		
	}

	public void getCloInput(Scanner input) {
		System.out.print("Clothe ID :");
		int id = input.nextInt();		
		this.setId(id);

		System.out.print("Clothe name :");
		String name = input.next();		
		this.setName(name);

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you have a Clothe Source? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Clothe Source :");
				String source = input.next();
				this.setSource(source);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setSource("");
				break;
			}
			else {
			}
		}

		answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you have a approximately Clothe Source? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("approximately Clothe Source :");
				String source = input.next();
				this.setSource(source);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setSource("");
				break;
			}
			else {
			}
		}

		System.out.print("Clothe price :");
		String price = input.next();
		this.setPrice(price);
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
		System.out.println("kind:" + skind + "name: " + name + " id: " + id + " source: " + source + " price: " + price + " approximately source: " + source + " approximately price: " + price);
	}

}
