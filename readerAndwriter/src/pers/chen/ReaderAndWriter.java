package pers.chen;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * 1��ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
 * 
 * 2��ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
 * 
 * 3�����е��ļ���Ŀ¼Ҫ��ʹ��File�����д�����
 * 
 * @author ��־��
 * @date 2017-06-16
 *
 */
public class ReaderAndWriter {
	// ����Ŀ¼
	private static File dir = new File("D:\\myio");
	private static File dir1 = new File("D:\\myio\\write");
	// �����ļ�
	private static File file = new File("D:\\myio\\write.txt");
	private static File file1 = new File("D:\\myio\\write\\write.txt");
	// �������롢�������
	private static Writer wt = null;
	private static Reader rd = null;

	static {

		try {
			if (!dir.exists()) {
				dir.mkdir();
			}

			if (!dir1.exists()) {
				dir1.mkdir();
			}

			if (!file.exists()) {
				file.createNewFile();
			}
			if (!file1.exists()) {
				file1.createNewFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// ��Դ��Դ��д������
	public static void writer() {
		try {
			wt = new FileWriter(file);
			String st = "���������ˮ������";
			wt.write(st);
			wt.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void read1() {
		int data = 0;
		try {
			rd = new FileReader(file);
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void read2() {
		try {
			rd = new FileReader(file);
			char[] ch = new char[1024];
			StringBuffer sb = new StringBuffer();
			int length = 0;
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] != 0) {
						sb.append(ch[i]);
						System.out.print(ch[i]);
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void read3() {
		try {
			rd = new FileReader(file);
			char[] ch = new char[1024];
			int length = 0;
			rd.read(ch, 0, ch.length);
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != 0) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writer1() {
		int data = 0;
		try {
			rd = new FileReader(file);
			wt = new FileWriter(file1);
			StringBuffer sb = new StringBuffer();
			while ((data = rd.read()) != -1) {
				sb.append((char) data);
			}
			String st = sb.toString();
			char[] ch = st.toCharArray();
			wt.write(ch);
			wt.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writer2() {
		try {
			rd = new FileReader(file);
			wt = new FileWriter(file1);
			StringBuffer sb = new StringBuffer();
			int data = 0;
			while ((data = rd.read()) != -1) {
				sb.append((char) data);
			}
			String st = sb.toString();
			wt.write(st);
			wt.flush();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writer3() {
		int data = 0;
		try {
			rd = new FileReader(file);
			wt = new FileWriter(file1);
			StringBuffer sb = new StringBuffer();
			while ((data = rd.read()) != -1) {
				sb.append((char) data);
			}
			String st = sb.toString();
			char[] ch = st.toCharArray();
			wt.write(ch, 0, ch.length);
			wt.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			wt.close();
			rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		writer();
		// read1();
		// read2();
		// read3();
		// writer1();
		// writer2();
		writer3();
		close();

	}

}
