package midtermexam;

public class Child extends Parent{
	
	void print() {
		System.out.println("�޼ҵ� �������̵�� �̷��� ����մϴ�!!");
		super.print();
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.print();
		
		Child c = new Child();
		c.print();

	}
}