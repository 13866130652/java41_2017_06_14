package cn.bdqn.work_20170613;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OverWork_20170615 {
	// 1.�����������������
	private static InputStream is = null;
	private static OutputStream os = null;
	// 1��������������
	private static byte b[] = new byte[1024];

	// �ļ��д���
	private static void wenjianjia(String path) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("�ļ��д����ɹ���");
			}
		} else {
			System.out.println("�ļ����Ѿ����ڣ�");
		}
	}

	// �ļ������ɹ�
	private static void chuangjian(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("�ļ������ɹ���");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѿ����ڣ�");
		}
	}

	// ��������
	private static void getin(String origin, String target) {
		try {
			is = new FileInputStream(origin);
			os = new FileOutputStream(target);
			int data = 0;
			while ((data = is.read(b)) != -1) {
				os.write(b, 0, data);
			}
			os.flush();
			System.out.println("�Ѿ���ɴ��룡");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// ͳ��a�ĸ���
	private static void getnum(String path, char ch) {
		int a = 0, b = 0;
		try {
			is = new FileInputStream(path);
			while ((a = is.read()) != -1) {
				if ((char) a == ch) {
					b++;
				}
			}
			System.out.println("a�ĸ����ǣ�" + b);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// �滻���ļ��е�a
	private static void change(String path, String path1, String a, String c) {
		try {
			is = new FileInputStream(path);
			os = new FileOutputStream(path1);
			StringBuffer st = new StringBuffer();
			int data = 0;
			while ((data = is.read()) != -1) {
				st.append((char) data);
			}
			String st1 = st.toString().replace(a, c);
			b = st1.getBytes();
			os.write(b);
			os.flush();
			System.out.println("���ݴ���ɹ���");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		wenjianjia("E:\\myio1");
		chuangjian("E:\\myio1\\test.txt");
		getin("E:\\myio\\moben.txt", "E:\\myio1\\test.txt");
		chuangjian("E:\\myio1\\test1.txt");
		getin("E:\\myio1\\test.txt", "E:\\myio1\\test1.txt");
		getnum("E:\\myio1\\test.txt", 'a');
		change("E:\\myio1\\test.txt", "E:\\myio1\\text.txt", "a", "b");
	}

}
