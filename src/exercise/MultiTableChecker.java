package exercise;

public class MultiTableChecker {

	public static void main(String[] args) {
		for (int i = 1; i<10; i = i+1) {

			for (int j = 1; j<10; j++) {
				if (j == 5) {
					System.out.printf("\t");
					continue;
				}
				System.out.print(i + "*" + j + "=" + (i*j)+ "\t");	
			}
			System.out.println();

	}
}
}