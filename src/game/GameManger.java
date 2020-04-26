package game;

public class GameManger {

	public static void main(String[] args) {
		Wizard wizard1 = new Wizard();
		Dude dude1 = new Dude();

		
		wizard1.hp += 1;
		
		System.out.println(wizard1.hp);
		
		wizard1.punchFace(dude1);
		dude1.punchFace(wizard1);
		
		
		System.out.println(dude1.hp);
		System.out.println(wizard1.hp);

		wizard1.cast(dude1, "punch");
		
		System.out.println(dude1.mp);
		
//		GrandWizard grandWizard1 = new GrandWizard();
//		
//		grandWizard1.name = "Flash";
//		grandWizard1.sayName();
//		
//		Dude dude2 = grandWizard1;
//		
//		dude2.sayName();
//		
//		((Dude) grandWizard1).sayName();
	}

}
