package exercise2;

public class SafeArray {
	private int[] a;
	public int length;
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;
	}
	
	public int get(int index) {
		if (index >= 0 && index <length) {
			return a[index];
		}
		else {
			System.err.println("Out of bounds");
			return Integer.MIN_VALUE; 
		}
	}
	
	public void put(int index, int value) {
		if (index >= 0 && index <length) {
			a[index] = value;
		}
		else {
			System.err.println("Out of bounds");			
		}
	}
}
