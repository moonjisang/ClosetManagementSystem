package midtermexam;

import java.util.Scanner;


public class Plane {
	
	Scanner sc = new Scanner(System.in);
	
	private String producer;
	private String model;
	private int maxNumberOfPassengers;
	//////////////////	//////////////////	//////////////////
	public Plane() {		
	}
//	public Plane(String producer) {
//		this.producer = producer;
//		}
//	public Plane(String producer, String model) {
//		this.producer = producer;
//		this.model = model;
//		}	
	public Plane(String producer, String model, int maxNumberOfPassengers) {
		this.producer = producer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	//////////////////	//////////////////	//////////////////
	public void getPlInfo(Scanner sc) {
		System.out.println("producer? :");
		String pro = sc.next();
		this.setProducer(pro);
		
		System.out.println("model? :");
		String mod = sc.next();
		this.setModel(mod);
		
		System.out.println("max Number Of Passengers? :");
		int max = sc.nextInt();
		this.setMaxNumberOfPassengers(max);
	}
////////////////////////////////////	//////////////////
	public void printInfo() {
		System.out.println("producer : " + producer + "-model : " + model + "-max Number Of Passengers : " + maxNumberOfPassengers);
	}
	//////////////////	//////////////////	//////////////////
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	//////////////////	//////////////////	//////////////////
	



//	public void deletePlane() {
//		System.out.println("Plane Model? : ");
//		String model = sc.nextLine();
//		int temp = -1;
//		for (int i = 0; i<arrayPlane.size(); i++) {
//			if (arrayPlane.get(i).plane.getModel == model) {
//				temp = i;
//				break;
//			}
//		}
//	}
	
}