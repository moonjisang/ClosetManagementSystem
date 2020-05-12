package clothe;

import java.util.Scanner;

public class TShirtsClothe extends TopClothe {

	public TShirtsClothe(ClotheKind kind) {
		super(kind);		
	}


	public void getCloInput(Scanner input) {
		setClotheID(input);
		setClotheName(input);
		setClotheSourcewithYN(input);
		setClothePrice(input);
	}
	
}
