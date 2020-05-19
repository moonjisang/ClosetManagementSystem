package exercise;

public class MaxNum {

	public static void main(String[] args) {
		int [] values = {1, 120, 56, 78, 87, 150};
		
		int max = values[0];
		for (int i = 0; i < values.length; i++) {
			if (max < values[i]) {
				max = values[i];
			}
			
		}
		System.out.println(max);
	}

}
