import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		ClotheManager closetManager = getObject("closetmanager.ser");
		if (closetManager == null) {
			closetManager = new ClotheManager(input);
		}
				
		selectMenu(input, closetManager);
		putObject(closetManager, "closetmanager.ser");
	}
	
	public static void selectMenu(Scanner input, ClotheManager closetManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					closetManager.addClothes();
					logger.log("add a clothe");
					break;
				case 2:
					closetManager.deleteClothes();
					logger.log("delete a clothe");
					break;
				case 3:
					closetManager.editClothes();
					logger.log("edit a clothe");
					break;
				case 4:
					closetManager.viewClothes();
					logger.log("view a list of clothe");
					break;
				default:
					continue;				
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num = -1;
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
	
	public static ClotheManager getObject(String filename) {
		ClotheManager closetManager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			closetManager = (ClotheManager)in.readObject();
			
			in.close();
			file.close();	
		} catch (FileNotFoundException e) {
			return closetManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return closetManager;
	}
	
	public static void putObject(ClotheManager closetManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(closetManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


