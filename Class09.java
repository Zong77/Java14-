package Java14;

import java.io.*;

public class Class09 {

	public static void main(String[] args) throws IOException {
		FileReader fr1 = new FileReader("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\aaa.txt");
		FileReader fr2 = new FileReader("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\bbb.txt");
		FileReader fr3 = new FileReader("C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\ccc.txt");
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		BufferedReader br3 = new BufferedReader(fr3);
		String str;

		System.out.println("aaa.txt");
		while ((str = br1.readLine()) != null)
			System.out.println(str);

		System.out.println("\nbbb.txt");
		while ((str = br2.readLine()) != null)
			System.out.println(str);

		System.out.println("\nccc.txt");
		while ((str = br3.readLine()) != null)
			System.out.println(str);

		fr1.close();
		fr2.close();
		fr3.close();
	}
}