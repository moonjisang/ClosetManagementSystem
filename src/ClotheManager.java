import java.util.ArrayList;
import java.util.Scanner;

import clothe.Clothe;
import clothe.ClotheKind;
import clothe.OuterClothe;
import clothe.TShirtClothe;

public class ClotheManager {
	ArrayList<Clothe> clothes = new ArrayList<Clothe> ();
	Scanner input;	
	ClotheManager(Scanner input) {
		this.input = input;
	}

	public void addClothes() {
		int kind = 0;
		Clothe clothe;
		while (kind != 1 && kind !=2) {
			System.out.println("1 for Pants");
			System.out.println("2 for TShirts");
			System.out.println("3 for Outer");
			System.out.print("Select num 1, 2, or 3 for Clothe Kind :");
			kind = input.nextInt();
			if (kind == 1) {
				clothe = new Clothe(ClotheKind.Pants);
				clothe.getCloInput(input);
				clothes.add(clothe);	
				break;
			}
			else if (kind == 2) {
				clothe = new TShirtClothe(ClotheKind.Tshirts);
				clothe.getCloInput(input);
				clothes.add(clothe);	
				break;
			}
			else if (kind == 3) {
				clothe = new OuterClothe(ClotheKind.Outer);
				clothe.getCloInput(input);
				clothes.add(clothe);	
				break;
			}
			else {
				System.out.print("Select num for Clothe Kind between 1 and 2:");
			}
		}	
	}

	public void deleteClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		int index = -1;
		for (int i = 0; i<clothes.size(); i++ ) {
			if (clothes.get(i).getId() == clotheId) {
				index = i;
				break;
			}
		}

		if (index >= 0) {
			clothes.remove(index);
			System.out.println("the clothe" + clotheId + "is deleted");
		}
		else {
			System.out.println("the clothe has not been registered");
			return;
		}
	}
	public void editClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		for (int i = 0; i<clothes.size(); i++ ) {
			Clothe clothe = clothes.get(i);
			if (clothe.getId() == clotheId) {
				int num = -1;
				while (num != 5) {
					System.out.println("** Clothe Info Edit Menu **");
					System.out.println(" 1. Edit Id");
					System.out.println(" 2. Edit Name");
					System.out.println(" 3. Edit Source");
					System.out.println(" 4. Edit Price");
					System.out.println(" 5. Exit");
					System.out.println("Select one number between 1 - 6:");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Clothe ID :");
						int id = input.nextInt();
						clothe.setId(id);
					}
					else if (num == 2) {
						System.out.print("Clothe name :");
						String name = input.next();
						clothe.setName(name);
					}
					else if (num == 3) {
						System.out.print("Clothe Source :");
						String source = input.next();
						clothe.setSource(source);
					}
					else if (num == 4) {
						System.out.print("Clothe price :");
						String price = input.next();
						clothe.setPrice(price);
					}
					else {
						continue;
					} //if
				} // while
				break;
			} // if
		} // for

	}
	public void viewClothes() {
		//		System.out.print("Clothe ID :");
		//		int clotheId = input.nextInt();
		System.out.println("# of registered clothes:" + clothes.size());
		for (int i = 0; i<clothes.size(); i++ ) {
			clothes.get(i).printInfo();
		}


	}
}
