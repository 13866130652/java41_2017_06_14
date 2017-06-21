package cn.zuoye;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {
	private static File f = new File("F:/filedemo/write.txt");
	private static Reader rd = null;

	// ʹ�õ�һ�ַ������ж�ȡ
	public static void read1() {
		try {
			rd = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int date = 0;
		try {
			System.out.println("��һ�ַ�����ȡ������£�");
			while ((date = rd.read()) != -1) {
				System.out.print((char) date);
			}
			System.out.println();
			if (rd != null) {
				rd.close();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	// ʹ�õڶ��ַ�����ȡ
	public static void read2() {
		try {
			rd = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int length = 0;
		char[] ch = new char[20];
		try {
			System.out.println("�ڶ��ַ�����ȡ������£�");
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print((char) ch[i]);
				}
			}
			System.out.println();
			if (rd != null) {
				rd.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ʹ�õ����ַ�����ȡ
	public static void read3() {
		try {
			rd = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int length = 0;
		char[] ch = new char[25];
		try {
			System.out.println("�����ַ�����ȡ������£�");
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print((char) ch[i]);
				}
			}
			System.out.println();
			if (rd != null) {
				rd.close();
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read1();
		read2();
		read3();

	}

}
