package cn.bdqn2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	public static void show(String past) {
		File f = new File(past);
		if (!f.exists()) {
			if (f.mkdirs()) {
				System.out.println("创建成功");
			} else {
				System.out.println("已经存在");
			}

		}
	}

	public static void show1(String past) {
		File f = new File(past);
		if (!f.exists()) {
			try {
				if (f.createNewFile()) {
					System.out.println("创建成功");
				} else {
					System.out.println("已经存在");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	public static void show2() {
		Reader rd = null;
		try {
			rd = new FileReader("F:/myio1/reader.txt");
			int date = 0;
			while ((date = rd.read()) != -1) {
				System.out.print((char) date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rd != null) {
				try {
					rd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void show3() {
		Reader rd = null;
		try {
			rd = new FileReader("F:/myio1/reader.txt");
			StringBuffer ch = new StringBuffer();

			int date = 0;
			while ((date = rd.read()) != -1) {
				ch.append((char) date);
			}
			String s = ch.toString();
			System.out.print(s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rd != null) {
				try {
					rd.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void show4() {
		Reader rd = null;
		BufferedReader bd = null;
		try {
			rd = new FileReader("F:/myio1/reader.txt");
			bd = new BufferedReader(rd);
			String s = bd.readLine();
			while (s != null) {
				System.out.println(s);
				s = bd.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bd != null) {
					bd.close();
				}
				if (rd != null) {
					rd.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		show("F:/myio1");
		show1("F:/myio1/reader.txt");
		System.out.println("***********第一种方法**********");
		// show2();
		System.out.println("\n***********第二种方法**********");
		// show3();
		System.out.println("\n***********第三种方法**********");
		show4();
	}

}
