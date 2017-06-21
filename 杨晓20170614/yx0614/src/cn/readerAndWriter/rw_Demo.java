package cn.readerAndWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class rw_Demo {

	private static File directory = new File("D:\\myio");
	private static File subDir = new File("D:\\myio\\write");
	private static File file = new File("D:\\myio\\write.txt");
	private static File file1 = new File("D:\\myio\\write\\write.txt");

	/**
	 * �����ļ���D:\myio\
	 */
	public static void createDirectory() {
		if (!directory.exists()) {
			directory.mkdirs();
			System.out.println("�����ļ��гɹ���");
		} else {
			System.out.println("�ļ����Ѵ��ڣ�");
		}
	}

	/**
	 * �����ļ���D:\myio\write
	 */
	public static void createSubDir() {
		if (!subDir.exists()) {
			subDir.mkdirs();
			System.out.println("�����ļ��гɹ���");
		} else {
			System.out.println("�ļ����Ѵ��ڣ�");
		}
	}

	/**
	 * D:\myio\�д����ļ�write.txt���ļ������Լ�д��
	 */
	public static void createFile() {
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("�����ļ��ɹ���");
			} else {
				System.out.println("�ļ��Ѵ��ڣ�");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ�ļ�������1��һ��һ���ַ���
	 */
	public static void reader1() {
		try {
			Reader rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��������
	private static char[] ch = new char[1024];

	/**
	 * ��ȡ�ļ�������2,���뻺�����飬һ��һ�ζ���һ��һ�����
	 */
	public static void reader2() {
		try {
			Reader rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print((char) ch[i]);
				}
			}
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * ��ȡ�ļ�������3,���뻺�����飬һ��һ�ζ���һ��һ�����
	 */
	public static void reader3() {
		try {
			Reader rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print((char) ch[i]);
				}
			}
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * д���ļ�������1��һ��һ���Ķ�ȡ��д��
	 */
	public static void writer1() {
		try {
			Reader rd = new FileReader(file);
			Writer wt = new FileWriter(file1, false);
			int data = 0;
			while ((data = rd.read()) != -1) {
				wt.write(data);
			}
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * д���ļ�������2��һ��һ�ζ�ȡ��һ��һ��д��
	 */
	public static void writer2() {
		try {
			Reader rd = new FileReader(file);
			Writer wt = new FileWriter(file1, false);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					wt.write(ch[i]);
				}
			}
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * д���ļ�������3��һ��һ�ζ�ȡ��һ��һ��д��
	 */
	public static void writer3() {
		try {
			Reader rd = new FileReader(file);
			Writer wt = new FileWriter(file1, false);
			int data = 0;
			while ((data = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, data);
			}
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// ����Ŀ¼
		createDirectory();
		// ������Ŀ¼
		createSubDir();
		// �����ļ�
		createFile();
		// ��ȡ�ļ�
		// reader1();
		// reader2();
		reader3();
		// д���ļ�
		// writer1();
		// writer2();
		writer3();
	}
}
