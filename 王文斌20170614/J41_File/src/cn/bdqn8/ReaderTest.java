package cn.bdqn8;

import java.io.File;
//1��ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
//2��ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
//3�����е��ļ���Ŀ¼Ҫ��ʹ��File�����д�����
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderTest {
	static Reader rd = null;
	static Writer wt = null;

	// ����Ŀ¼
	public static void mu(File file) {
		if (!file.exists()) {
			file.mkdirs();
		} else {
			System.out.println(file + "Ŀ¼�����ɹ���");
		}
	}

	// �����ļ�
	public static void wj(File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(file + "�ļ������ɹ���");
		}
	}

	// ��ȡ����1
	public static void reader1() {
		int data = 0;
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ȡ����2
	public static void reader2() {
		int length = 0;
		char[] ch = new char[1024];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ��ȡ����3
	public static void reader3() {
		int length = 0;
		char[] ch = new char[1];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���1
	public static void writer1() {
		int data = 0;
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			wt = new FileWriter("D:\\myio\\write\\write.txt");
			while ((data = rd.read()) != -1) {
				wt.write(data);
				wt.flush();
			}

		} catch (Exception e) {
		}
	}

	// �Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���2
	public static void writer2() {
		int length = 0;
		char[] ch = new char[1024];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			wt = new FileWriter("D:\\myio\\write\\write.txt");
			while ((length = rd.read(ch)) != -1) {
				wt.write(ch);
				wt.flush();
			}

		} catch (Exception e) {
		}
	}

	// �Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���3
	public static void writer3() {
		int length = 0;
		char[] ch = new char[1024];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			wt = new FileWriter("D:\\myio\\write\\write.txt");
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, length);
				wt.flush();
			}

		} catch (Exception e) {
		}
	}

	// �ر���Դ
	public static void close() {
		if (wt != null) {
			try {
				wt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rd != null) {
			try {
				rd.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		mu(new File("D:\\myio"));
		wj(new File("D:\\myio\\write.txt"));
		reader1();
		// reader2();
		// reader3();
		mu(new File("D:\\myio\\write"));
		wj(new File("D:\\myio\\write\\write.txt"));
		writer1();
		// writer2();
		// writer3();
		close();
	}

}
