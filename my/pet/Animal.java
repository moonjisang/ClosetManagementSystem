package pet;

public abstract class Animal {
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sound();
}
