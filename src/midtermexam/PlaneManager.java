package midtermexam;

import java.util.ArrayList;
import java.util.Scanner;



public class PlaneManager {
	ArrayList<Plane> planes = new ArrayList<Plane> ();
	Scanner input;	
	PlaneManager(Scanner input) {
		this.input = input;
	}

	public void addPlanes() {

		Plane plane = new Plane();
		plane.getPlInfo(input);
		planes.add(plane);	

	}	


public void deletePlanes() {
	System.out.print("Plane MODEL :");
	String planeModel = input.next();
	int index = -1;
	for (int i = 0; i<planes.size(); i++ ) {
		if (planes.get(i).getModel().contentEquals(planeModel)) {
			index = i;
			break;
		}
	}

	if (index >= 0) {
		planes.remove(index);
		System.out.println("the plane " + planeModel + " is deleted");
	}
	else {
		System.out.println("the plane has not been registered");
		return;
	}
}

public void searchPlanes() {
	System.out.println("The number of registered planes:" + planes.size());
	for (int i = 0; i<planes.size(); i++ ) {
		planes.get(i).printInfo();
	}


}
}
