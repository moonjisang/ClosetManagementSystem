import java.util.Scanner;

public class ClotheManager {
	Clothe clothe;
	Scanner input;	
	ClotheManager(Scanner input) {
		this.input = input;
	}
	
	public void addClothes() {
		clothe = new Clothe() ;
		System.out.print("Clothe ID :");
		clothe.id = input.nextInt();		
		System.out.print("Clothe name :");
		clothe.name = input.next();				
		System.out.print("Clothe Source :");
		clothe.source = input.next();		
		System.out.print("Clothe price :");
		clothe.price = input.next();		
	}
	
	public void deleteClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		if (clothe == null) {
			System.out.println("the clothe has not been registered");
			return;
		}
		if (clothe.id == clotheId) {
			clothe = null;
			System.out.println("the clothe is deleted");
		}
	}
	public void editClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		if (clothe.id == clotheId) {
			int num = -1;
			while (num != 5) {
				System.out.println("** Clothe Info Edit Menu **");
				System.out.println(" 1. Edit Id");
				System.out.println(" 2. Edit Name");
				System.out.println(" 3. Edit Source");
				System.out.println(" 4. View Price");
				System.out.println(" 5. Exit");
				System.out.println("Select one number between 1 - 6:");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Clothe ID :");
					clothe.id = input.nextInt();		
				}
				else if (num == 2) {
					System.out.print("Clothe name :");
					clothe.name = input.next();		
				}
				else if (num == 3) {
					System.out.print("Clothe Source :");
					clothe.source = input.next();		
				}
				else if (num == 4) {
					System.out.print("Clothe price :");
					clothe.price = input.next();
				}
				else {
					continue;
				}
			}
		}
		
	}
	public void viewClothes() {
		System.out.print("Clothe ID :");
		int clotheId = input.nextInt();
		if (clothe.id == clotheId) {
			clothe.printInfo();
		}
		
	}
}
