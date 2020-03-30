import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while (num != 6) {
		System.out.println("Closet Management System Menu ***");
		System.out.println(" 1. Add Clothes");
		System.out.println(" 2. Delete Clothes");
		System.out.println(" 3. Edit Clothes");
		System.out.println(" 4. View Clothes");
		System.out.println(" 5. Show a menu");
		System.out.println(" 6. Exit");
		System.out.println("Select one number between 1 - 6:");
		num = input.nextInt();
		if (num == 1) {
			addClothes();
		}
		else if (num == 2) {
			deleteClothes();
		}
		else if (num == 3) {
			editClothes();
		}
		else if (num == 4) {
			viewClothes();
		}
		else {
			continue;
		}
		}
	}
	public static void addClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes ID :");
		int clothesId = input.nextInt();
		
		System.out.print("Clothes name :");
		String clothesName = input.next();		
		
		System.out.print("Email addresse :");
		String clothesEmail = input.next();
		
		System.out.print("Phone number :");
		String clothesPhone = input.next();
		
	}
	public static void deleteClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes ID :");
		int clothesId = input.nextInt();
		
	}
	public static void editClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes ID :");
		int clothesId = input.nextInt();
		
	}
	public static void viewClothes() {
		Scanner input = new Scanner(System.in);
		System.out.print("Clothes ID :");
		int clothesId = input.nextInt();
		
	}
}