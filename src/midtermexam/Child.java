package midtermexam;

public class Child extends Parent{
	
	void print() {
		System.out.println("메소드 오버라이드는 이렇게 사용합니다!!");
		super.print();
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.print();
		
		Child c = new Child();
		c.print();

	}
}