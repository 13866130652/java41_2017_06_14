package wkx20170615;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

/**
 * ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
 *
 */
public class ReaderDemo {
	private static File f = new File("D:\\myio\\write.txt");
	private static Reader rd = null;

	// �������ַ���ȡ
	public static void read1() {
		try {
			rd = new FileReader(f);
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ���ַ������ȡ
	public static void read2() {
		try {
			rd = new FileReader(f);
			char ch[] = new char[1024];
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				System.out.print(new String(ch, 0, data));
			}
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ���ַ������ȡ
	public static void read3() {
		try {
			rd = new FileReader(f);
			char ch[] = new char[1024];
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print(ch[i]);
				}
			}
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// read1();
		// read2();
		read3();

	}

}
