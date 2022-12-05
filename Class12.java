package Java14;

import java.io.*;

public class Class12 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(
				"C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\ch14\\ch14\\app14_4\\random.txt");
		String str;
		for (int i = 0; i < 5; i++) {
			str = Double.toString(Math.random());
			if (i <= 3)
				str += "\r\n";
			byte data[] = str.getBytes();
			fo.write(data);
		}
		fo.close();

		FileInputStream fi = new FileInputStream(
				"C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\ch14\\ch14\\app14_4\\random.txt");
		byte d[] = new byte[fi.available()];
		fi.read(d);
		System.out.println(new String(d));
		fi.close();
	}
}