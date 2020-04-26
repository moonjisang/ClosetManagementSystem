package animals;

public class Tester {

	public static void main(String[] args) {
		Animal [] animals = new Animal [4];
		
		animals[0] = new Cat();
		animals[1] = new Cow();
		animals[2] = new Dog();
		animals[3] = new Lion();
		
		for (int i = 0; i< animals.length; i++) {
			animals[i].bark();
		}
		
		
		
		
		
		//		Cat cat = new Cat();
//		Dog dog = new Dog();
//		Animal animal = new Animal();
//
//		cat.bark();
//		dog.bark();
//		animal.bark();
	}

}
