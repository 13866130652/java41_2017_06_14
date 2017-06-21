package cn.bdqn;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Demo {
	// �����ַ�����������
	private static Reader rd = null;
	// �������������
	private static Writer wt = null;
	private static char ch[] = new char[1024];

	// ����Ŀ¼
	public static void getDirectory(String path) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("Ŀ¼" + path + "�����ɹ�");
			}
		} else {
			System.out.println("Ŀ¼" + path + "�Ѵ���");
		}
	}

	// �����ļ�
	public static void getFile(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("�ļ�" + path + "�����ɹ�");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ�" + path + "�Ѵ���");
		}
	}

	// ����д���ݣ�һ��
	public static void get(String path, String a, String b) {
		StringBuffer sb = new StringBuffer();
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("Ŀ¼" + path + "�����ɹ�");
			}
		} else {
			System.out.println("Ŀ¼" + path + "�Ѵ���");
		}
		try {
			rd = new FileReader(a);
			wt = new FileWriter(b, true);
			int date = 0;
			while ((date = rd.read()) != -1) {
				sb.append((char) date);
			}
			System.out.print(sb);
			String st = sb.toString();
			wt.write(st);
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ����д���ݣ�����
	public static void get1(String path, String a, String b) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("Ŀ¼" + path + "�����ɹ�");
			}
		} else {
			System.out.println("Ŀ¼" + path + "�Ѵ���");
		}
		try {
			rd = new FileReader(a);
			wt = new FileWriter(b, true);
			int length = 0;
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					if (ch[i] != '\0') {
						System.out.print(ch[i]);
					}
				}
				wt.write(ch);
			}
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ����д���ݣ�����
	public static void get2(String path, String a, String b) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("Ŀ¼" + path + "�����ɹ�");
			}
		} else {
			System.out.println("Ŀ¼" + path + "�Ѵ���");
		}
		try {
			rd = new FileReader(a);
			wt = new FileWriter(b, true);
			int length = 0;
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < length; i++) {
					if (ch[i] != '\0') {
						System.out.print(ch[i]);
					}
				}
				wt.write(ch, 0, length);
			}
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ر�
	public static void close() {
		try {
			if (rd != null) {
				rd.close();
			}
			if (wt != null) {
				wt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		getDirectory("D:\\myio");
		getFile("D:\\myio\\write.txt");
		get("D:\\myio\\write", "D:\\myio\\write.txt", "D:\\myio\\write\\write.txt");
		// get1("D:\\myio\\write", "D:\\myio\\write.txt",
		// "D:\\myio\\write\\write.txt");
		// get2("D:\\myio\\write", "D:\\myio\\write.txt",
		// "D:\\myio\\write\\write.txt");
		close();
	}

}
