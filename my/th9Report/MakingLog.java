package th9Report;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class MakingLog {

	public static void logging() {
		Date date = new Date();

		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" + "\r\n");
		try {
			FileOutputStream file = new FileOutputStream("text.txt", true);

			file.write(format.format(date).getBytes());

			file.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}

//		try {
//			BufferedReader file = new BufferedReader(new FileReader("text.txt"));
//
//			while (true) {
//				String str = file.readLine();
//
//				if (str == null) {
//					break;
//				}
//
//				System.out.println(str);
//			}
//			file.close();
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}

	}

}
