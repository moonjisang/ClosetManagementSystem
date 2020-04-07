import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClosetManager closetManager = new ClosetManager(input);
		int num = -1;
		
		while (num != 5) {
		System.out.println("Closet Management System Menu ***");
		System.out.println(" 1. Add Clothes");
		System.out.println(" 2. Delete Clothes");
		System.out.println(" 3. Edit Clothes");
		System.out.println(" 4. View Clothes");
		System.out.println(" 5. Exit");
		System.out.println("Select one number between 1 - 6:");
		num = input.nextInt();
		if (num == 1) {
			closetManager.addClothes();
		}
		else if (num == 2) {
			closetManager.deleteClothes();
		}
		else if (num == 3) {
			closetManager.editClothes();
		}
		else if (num == 4) {
			closetManager.viewClothes();
		}
		else {
			continue;
		}
		}
}
}
