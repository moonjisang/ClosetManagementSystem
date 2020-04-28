package midtermexam;

public class Object {

	String x = "x";
	String y = "x";
	String k = x;
	int z = 5;
	
	public static void main(String[] args) {
		Object ob = new Object();
		Object ob1 = new Object();
		Object ob2 = ob;
				
		System.out.println(ob.x.equals(ob.y));
		System.out.println(ob.x.equals(ob.k));
		
		System.out.println(ob.equals(ob1));
		System.out.println(ob.equals(ob2));
		System.out.println(ob.toString());
		System.out.println(ob.getClass());
		System.out.println(ob.hashCode());
	}
}