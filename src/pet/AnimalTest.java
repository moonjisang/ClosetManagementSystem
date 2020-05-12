package pet;

public class AnimalTest {

	public static void main(String[] args) {

		Animal ani[] = new Animal[2];
		
		ani[0] = new Dog();
		ani[1] = new Cat();
		
		for (int i = 0; i<2; i++) {
			ani[i].sound();
		}
		
		Pet pet[] = new Pet[2];
		
		pet[0] = (Dog)ani[0];
		pet[1] = new Cat();

		for (int i = 0; i<2; i++) {
			pet[i].play();
		}
	}

}
