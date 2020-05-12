import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClotheManager closetManager = new ClotheManager(input);

		int num = -1;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				closetManager.addClothes();
				break;
			case 2:
				closetManager.deleteClothes();
				break;
			case 3:
				closetManager.editClothes();
				break;
			case 4:
				closetManager.viewClothes();
				break;
			default:
				continue;				
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("Closet Management System Menu ***");
		System.out.println(" 1. Add Clothes");
		System.out.println(" 2. Delete Clothes");
		System.out.println(" 3. Edit Clothes");
		System.out.println(" 4. View Clothes");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 6:");
	}
}
