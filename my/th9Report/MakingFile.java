package th9Report;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MakingFile extends MakingLog {

	public static void main(String[] args) {
		MakingLog ML = new MakingLog();

		for (int i = 0; i<4; i++) {
			try {
				FileOutputStream file = new FileOutputStream("text.txt", true);
				Scanner in = new Scanner(System.in);
				String[] str = new String[4];
				str[i] = in.nextLine();
				String st = str[i]+"  ";

				file.write(st.getBytes());
				file.close();	
				ML.logging();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
