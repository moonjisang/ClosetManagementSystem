package clothe;

import java.util.Scanner;

public class TShirtClothe extends Clothe {

	public TShirtClothe(ClotheKind kind) {
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

		System.out.print("Clothe price :");
		String price = input.next();
		this.setPrice(price);
	}
}
