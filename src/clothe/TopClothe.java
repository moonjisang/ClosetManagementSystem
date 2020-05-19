package clothe;

import java.util.Scanner;

import exception.SourceFormatException;

public abstract class TopClothe extends Clothe {

	public TopClothe(ClotheKind kind) {
		super(kind);		
	}

	@Override
	public abstract void getCloInput(Scanner input);

	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "name: " + name + " id: " + id + " source: " + source + " price: " + price);
	}

	public void setClotheSourcewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') 
		{
			System.out.print("Do you have a Clothe Source? (Y/N)");
			answer = input.next().charAt(0);
			try {
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
			catch(SourceFormatException e) {
				System.out.println("Incorrect Source Format. put the source that contains from");
			}
		}

	}
}
