package Java14;

import java.io.*;

public class Class13 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream(
				"C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\ch14\\ch14\\app14_4\\rand.txt");
		for (int i = 1; i <= 1000; i++) {
			Double num = new Double(Math.random() * 100000);
			String str = Integer.toString(num.intValue()) + "\r\n";
			byte data[] = str.getBytes();
			fo.write(data);
		}
		fo.close();

		FileInputStream fi = new FileInputStream(
				"C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\ch14\\ch14\\app14_4\\rand.txt");
		byte data[] = new byte[fi.available()];
		int max = 0, min = 100000;
		long sum = 0L;
		fi.read(data);
		String str = new String(data);
		String str2[] = str.split("\r\n");
		int arr[] = new int[str2.length];
		for (int i = 0; i < str2.length; i++) {
			arr[i] = Integer.parseInt(str2[i]);
			sum += arr[i];
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
		}
		System.out.println("Maximum=" + max + ", Minmum=" + min);
		System.out.println("Average=" + sum / 1000);

		FileOutputStream fo2 = new FileOutputStream(
				"C:\\Users\\Qi\\課程\\大二上學期\\物件導向程式設計\\ch14\\ch14\\ch14\\app14_4\\rand2.txt");
		bubble_sort(arr);
		for (int i = 0; i < arr.length; i++) {
			String bstr = Integer.toString(arr[i]) + "\r\n";
			byte data2[] = bstr.getBytes();
			fo2.write(data2);
		}
		fo2.close();
		fi.close();
	}

	public static void bubble_sort(int a[]) {
		int i, j, temp;
		boolean flag = true;
		for (i = 1; (i < a.length) && (flag == true); i++) {
			flag = false;
			for (j = 0; j < (a.length - i); j++)
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + i];
					a[j + 1] = temp;
					flag = true;
				}
		}
		return;
	}
}