import java.util.Scanner;

public class ClosetManager {
	Clothe clothe;
	Scanner input;	
	ClosetManager(Scanner input) {
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
			System.out.println("the clothe to be edited is " + clotheId);
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
