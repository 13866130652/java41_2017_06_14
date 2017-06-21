package cn.zuoye;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterDemo {
	private static File f = new File("F:/filedemo/write1.txt");
	private static File f1 = new File("F:/filedemo/write.txt");
	private static Reader rd = null;
	private static Writer wt = null;

	// ʹ�õ�һ�ַ���д
	public static void write() {
		try {
			rd = new FileReader(f1);
			wt = new FileWriter(f, true);
			int length = 0;
			wt.write("(��һ�ַ����ɹ�)");
			while ((length = rd.read()) != -1) {
				wt.write(length);
			}
			wt.flush();
			wt.close();
			rd.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// ʹ�õڶ��ŷ���д
	public static void write1() {
		try {
			rd = new FileReader(f1);
			wt = new FileWriter(f, true);
			int length = 0;
			char[] ch = new char[20];
			StringBuffer sb = new StringBuffer();
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					sb.append((char) ch[i]);
				}
			}
			wt.write("(�ڶ��ַ����ɹ�)");
			wt.write(sb.toString());
			wt.flush();
			wt.close();
			rd.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// ʹ�õ����ŷ���д
	public static void write2() {
		try {
			rd = new FileReader(f1);
			wt = new FileWriter(f, true);
			int length = 0;
			char[] ch = new char[20];
			StringBuffer sb = new StringBuffer();
			wt.write("(�����ַ����ɹ�)");
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, length);
			}

			wt.write(sb.toString());
			wt.flush();
			wt.close();
			rd.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		write();
		write1();
		write2();

	}

}
