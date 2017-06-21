package cn.bdqn.work_20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {
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

	// �ļ�����
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

	// Reader�����ַ������������̨
	public static void read1(String path, String path1) {
		try {
			Reader rd = new FileReader(path);
			Writer ww = new FileWriter(path1);
			StringBuffer st = new StringBuffer();
			int data = 0;
			System.out.println("**************��һ�ַ�ʽ���/���뵽ָ���ļ���**************");
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
				st.append((char) data);
			}
			ww.write(st.toString().toCharArray());
			ww.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read2(String path, String path1) {
		try {
			Reader rd = new FileReader(path);
			Writer ww = new FileWriter(path1);
			char b[] = new char[8];
			StringBuffer st = new StringBuffer();
			int data = 0;
			System.out.println("**************�ڶ��ַ�ʽ���/���뵽ָ���ļ���**************");
			int length = 0;
			while ((length = rd.read(b)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(b[i]);
					st.append(b[i]);
				}
			}
			String st1 = st.toString();
			b = st1.toCharArray();
			ww.write(b);
			ww.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void read3(String path, String path1) {
		try {
			Reader rd = new FileReader(path);
			Writer ww = new FileWriter(path1);
			char b[] = new char[5];
			int data = 0;
			System.out.println("**************�����ַ�ʽ���/���뵽ָ���ļ���**************");
			int length = 0;
			while ((length = rd.read(b, 0, 5)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(b[i]);
				}
				ww.write(b, 0, 5);
				ww.flush();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		wenjianjia("D:\\myio\\write");
		chuangjian("D:\\myio\\write.txt");
		chuangjian("D:\\myio\\write\\write.txt");
		read1("D:\\myio\\write.txt", "D:\\myio\\write\\write.txt");
		System.out.println();
		read2("D:\\myio\\write.txt", "D:\\myio\\write\\write.txt");
		System.out.println();
		read3("D:\\myio\\write.txt", "D:\\myio\\write\\write.txt");
	}

}
