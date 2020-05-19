package midtermexam;

public class MethodOverloading {
	String name;
	int age;
	int height;
	String race;
	
	static void getInfo() {
		System.out.println("Please type your name, age, height, race");
	}
	static void getInfo(String name) {
		System.out.println(name);
	}
	static void getInfo(String name, int age) {
		System.out.println(name +"/"+ age);
	}
	static void getInfo(String name, int age, int height) {
		System.out.println(name +"/"+ age +"/"+ height);
	}
	static void getInfo(String name, int age, int height, String race) {
		System.out.println(name +"/"+ age +"/"+ height +"/"+ race);
	}

	
	public static void main(String[] args) {

		getInfo();
		getInfo("moon ji sang");
		getInfo("moon ji sang", 23);
		getInfo("moon ji sang", 23, 180);
		getInfo("moon ji sang", 23, 180, "korean");
	}

}