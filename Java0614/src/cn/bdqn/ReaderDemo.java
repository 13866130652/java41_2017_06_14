package cn.bdqn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReaderDemo {
	private static File f = new File("D:\\myio\\write.txt");
	private static Reader rd = null;

	// 使用第一种方法进行读取
	public static void read1() {
		try {
			rd = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int date = 0;
		try {
			System.out.println("第一种方法读取结果如下：");
			while ((date = rd.read()) != -1) {
				System.out.print((char) date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 使用第二种方法读取
	public static void read2() {
		try {
			rd = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int length = 0;
		char[] ch = new char[20];
		try {
			System.out.println("第二种方法读取结果如下：");
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print((char) ch[i]);
				}
			}
			System.out.println();
			if (rd != null) {
				rd.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 使用第三种方法读取
	public static void read3() {
		try {
			rd = new FileReader(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		int length = 0;
		char[] ch = new char[20];
		try {
			System.out.println("第二种方法读取如下：");
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i > length; i++) {
					System.out.println((char) ch[i]);
				}
			}
			System.out.println();
			if (rd != null) {
				rd.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read1();
		read2();
		read3();
	}
}
