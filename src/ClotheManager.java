import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import clothe.Clothe;
import clothe.ClotheInput;
import clothe.ClotheKind;
import clothe.OuterClothe;
import clothe.PantsClothe;
import clothe.TShirtsClothe;

public class ClotheManager {
	ArrayList<ClotheInput> clothes = new ArrayList<ClotheInput> ();
	Scanner input;	
	ClotheManager(Scanner input) {
		this.input = input;
	}

	public void addClothes() {
		int kind = 0;
		ClotheInput clotheInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Pants");
				System.out.println("2 for TShirts");
				System.out.println("3 for Outer");
				System.out.print("Select num 1, 2, or 3 for Clothe Kind :");
				kind = input.nextInt();
				if (kind == 1) {
					clotheInput = new PantsClothe(ClotheKind.Pants);
					clotheInput.getCloInput(input);
					clothes.add(clotheInput);	
					break;
				}
				else if (kind == 2) {
					clotheInput = new TShirtsClothe(ClotheKind.Tshirts);
					clotheInput.getCloInput(input);
					clothes.add(clotheInput);	
					break;
				}
				else if (kind == 3) {
					clotheInput = new OuterClothe(ClotheKind.Outer);
					clotheInput.getCloInput(input);
					clothes.add(clotheInput);	
					break;
				}
				else {
					System.out.print("Select num for Clothe Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}	
	}

	public void deleteClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		int index = findIndex(clotheId);
		removefromClothes(index, clotheId);
	}

	public int findIndex(int clotheId) {
		int index = -1;
		for (int i = 0; i<clothes.size(); i++ ) {
			if (clothes.get(i).getId() == clotheId) {
				index = i;
				break;
			}
		}
		return index;
	}

	public int removefromClothes(int index, int clotheId) {
		if (index >= 0) {
			clothes.remove(index);
			System.out.println("the clothe" + clotheId + "is deleted");
			return 1;
		}
		else {
			System.out.println("the clothe has not been registered");
			return -1;
		}
	}

	public void editClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		for (int i = 0; i<clothes.size(); i++ ) {
			ClotheInput clothe = clothes.get(i);
			if (clothe.getId() == clotheId) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						clothe.setClotheID(input);
						break;
					case 2:
						clothe.setClotheName(input);
						break;
					case 3:
						clothe.setClotheSource(input);
						break;
					case 4:
						clothe.setClothePrice(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}

	public void viewClothes() {
		System.out.println("# of registered clothes:" + clothes.size());
		for (int i = 0; i<clothes.size(); i++ ) {
			clothes.get(i).printInfo();
		}
	}



	public void showEditMenu() {
		System.out.println("** Clothe Info Edit Menu **");
		System.out.println(" 1. Edit Id");
		System.out.println(" 2. Edit Name");
		System.out.println(" 3. Edit Source");
		System.out.println(" 4. Edit Price");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 6:");
	}
}
