package exercise;

import java.util.ArrayList;
import java.util.HashSet;

public class Array {

	public static void main(String[] args) {

		HashSet<String> values = new HashSet<String>();
		values.add("Pepperoni");
		values.add("Mushroons");
		values.add("Onions");
		values.add("Sousage");
		values.add("Bacon");

		
		for (String val : values) {
			System.out.println(val);
		}

	}

}
