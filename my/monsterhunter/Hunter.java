package monsterhunter;

public class Hunter {
	private int power;
	
	public Hunter() {
		
	}
	

	public void power(int power) {
		this.power = power;
	}
	
	public void punch () {
		Monster monster = new Monster(1000);
		int hp = monster.getHp()-power;
		System.out.println("Hunter attacked Monster with a power of " + power);
		System.out.println("Monster has " + hp + "hp.");
	}
}