package report;
import report.monster;

public class hunter {
	
	private int power;
	
	hunter(int power) {
		this.power = power;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	// Please, write the attack method.
	public void punchFace(monster power) {
		hp -= power;
		return hp;
	}

}