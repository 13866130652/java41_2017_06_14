package cn.bdqn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer��ϰ
public class Demo2 {
	private static File file = null;
	private static Writer wt = null;

	// �����ļ����ļ���
	static {
		file = new File("E:\\myOO\\write");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("�����ļ��гɹ���");
			}
		} else {
			System.out.println("�ļ����Ѵ��ڣ�");
		}
		file = new File("E:\\myOO\\write\\write.txt");
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("�����ļ��ɹ���");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѵ��ڣ�");
		}
	}

	// д���ַ���
	public static void write1() {
		String name = "��Ҫ�ú�ѧϰ���������ϣ�";
		try {
			wt = new FileWriter(file);
			wt.write(name);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// д���ַ�����
	public static void write2() {
		String name = "��Ҫ�ú�ѧϰ���������ϣ�";
		char[] ch = name.toCharArray();
		try {
			wt = new FileWriter(file);
			// cbuf - �ַ�����
			// off - ��ʼд���ַ�����ƫ����
			// len - Ҫд����ַ���
			wt.write(ch, 0, ch.length - 5);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// д���ַ�����ĳһ����
	public static void write3() {
		String name = "��Ҫ�ú�ѧϰ���������ϣ�";
		try {
			wt = new FileWriter(file);
			// str - �ַ���
			// off - ��Գ�ʼд���ַ���ƫ����
			// len - Ҫд����ַ���
			wt.write(name, 0, name.length() - 2);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// write1();
		// write2();
		write3();
	}
}
