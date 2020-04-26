package game;

import java.util.ArrayList;

public class Wizard extends Dude {
	ArrayList<Spell> spells = new ArrayList<Spell>();
	
	public void cast(Dude target, String spell) {
		target.mp -= 10;
	}
	
}
