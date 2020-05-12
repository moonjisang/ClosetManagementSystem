package clothe;

import java.util.Scanner;

public interface ClotheInput {

	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setSource(String source);
	
	public void setPrice(String price);
	
	public void getCloInput(Scanner input);
	
	public void printInfo();
	
	public void setClotheID(Scanner input);
	
	public void setClotheName(Scanner input);
	
	public void setClotheSource(Scanner input);
	
	public void setClothePrice(Scanner input);
}
