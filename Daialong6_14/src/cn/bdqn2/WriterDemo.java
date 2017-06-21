package cn.bdqn2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterDemo {

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
		Writer wt = null;
		Reader rd = null;
		try {
			wt = new FileWriter("F:/myio1/write/write.txt");
			rd = new FileReader("F:/myio1/reader.txt");
			int date = 0;
			while ((date = rd.read()) != -1) {
				wt.write((char) date);
			}
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (wt != null) {
					wt.close();
				}
				if (rd != null) {
					rd.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public static void show3() {
		Writer wt = null;
		Reader rd = null;
		try {
			wt = new FileWriter("F:/myio1/write/write.txt");
			rd = new FileReader("F:/myio1/reader.txt");
			StringBuffer ch = new StringBuffer();

			int date = 0;
			while ((date = rd.read()) != -1) {
				ch.append((char) date);
			}
			String s = ch.toString();
			wt.write(s);
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (wt != null) {
					wt.close();
				}
				if (rd != null) {
					rd.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	public static void show4() {
		Reader rd = null;
		Writer wt = null;
		BufferedReader bd = null;
		try {
			rd = new FileReader("F:/myio1/reader.txt");
			bd = new BufferedReader(rd);
			wt = new FileWriter("F:/myio1/write/write.txt");
			BufferedWriter bw = new BufferedWriter(wt);
			String s = bd.readLine();
			while (s != null) {
				bw.write(s);
				bw.newLine();
				bw.flush();
				s = bd.readLine();
			}
			bw.write("OVER");
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (bd != null) {
					bd.close();
				}
				if (wt != null) {
					wt.close();
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
		show("F:/myio1/write");
		show1("F:/myio1/write/write.txt");
		System.out.println("***********第一种方法**********");
		// show2();
		System.out.println("\n***********第二种方法**********");
		show3();
		// System.out.println("\n***********第三种方法**********");
		// show4();
	}

}
