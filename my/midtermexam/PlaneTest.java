package midtermexam;

import java.util.Scanner;

public class PlaneTest {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PlaneManager planeManager = new PlaneManager(input);

		int num = -1;
		while (num != 5) {
			System.out.println(" 1. Add Planes");
			System.out.println(" 2. Delete Planes");
			System.out.println(" 3. Search Planes");
			System.out.println("Select one number between 1 - 3:");
			num = input.nextInt();
			if (num == 1) {
				planeManager.addPlanes();
			}
			else if (num == 2) {
				planeManager.deletePlanes();
			}
			else if (num == 3) {
				planeManager.searchPlanes();
			}
			else {
				continue;
			}
		}
	}

}