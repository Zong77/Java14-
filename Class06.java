package Java14;

import java.io.*;

public class Class06 {

	public static void main(String[] args) {
		try {
			char data[] = new char[128];
			FileReader fr = new FileReader("C:\\Users\\Qi\\�ҵ{\\�j�G�W�Ǵ�\\����ɦV�{���]�p\\ch14\\ch14\\ch14\\app14_1\\train.txt");

			int num = fr.read(data);
			String str = new String(data, 0, num);
			System.out.println("Characters read= " + num);
			System.out.println(str);

			fr.close();
		} catch (IOException e) {

		}
	}
}