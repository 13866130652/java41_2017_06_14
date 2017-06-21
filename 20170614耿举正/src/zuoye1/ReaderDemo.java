package zuoye1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 *1��ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
 *2��ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
 *3�����е��ļ���Ŀ¼Ҫ��ʹ��File�����д�����
 */
public class ReaderDemo {

	// ����myioĿ¼
	public static void creatMyio() {
		File file = new File("D:/myio");
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("����myioĿ¼�ɹ���");
		} else {
			System.out.println("myioĿ¼�Ѵ��ڣ�");
		}
	}

	// ����write.txt�ļ��������ַ������ú�ѧϰ���������ϡ�
	private static File file = new File("D:/myio/write.txt");

	public static void creatWrite() {
		// ����write.txt�ļ�
		boolean flag = false;
		if (!file.exists()) {
			try {
				Writer wt = new FileWriter(file);
				// ���ַ���д���ļ���
				String st = "�ú�ѧϰ����������";
				wt.write(st);
				wt.flush();
				flag = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (flag) {
			System.out.println("����write.txtĿ¼�ɹ���");
		} else {
			System.out.println("write.txt�ļ��Ѵ��ڣ�");
		}
	}

	// һ���ַ�һ���ַ���
	public static void reader1() {
		Reader is = null;
		int date = 0;
		try {
			is = new FileReader(file);
			while ((date = is.read()) != -1) {
				System.out.print((char) date);
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��ȡ���ݵ���������
	public static void reader2() {
		Reader is = null;
		char ch[] = new char[10];
		int length = 0;
		StringBuffer sb = new StringBuffer();
		try {
			is = new FileReader(file);
			while ((length = is.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					// System.out.print(ch[i]);
					sb.append(ch[i]);
				}
			}
			String st = sb.toString();// ת��String����
			System.out.println(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ʹ�����黺���ȡ
	public static void reader3() {
		Reader is = null;
		char ch[] = new char[10];
		int length = 0;
		StringBuffer sb = new StringBuffer();
		try {
			is = new FileReader(file);
			while ((length = is.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < length; i++) {
					// System.out.print(ch[i]);
					sb.append(ch[i]);
				}
			}
			String st = sb.toString();// ת��String����
			System.out.println(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ����miyo/writeĿ¼
	public static void creatMyio1() {
		File file = new File("D:/myio/write");
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("����miyo/writeĿ¼�ɹ���");
		} else {
			System.out.println("miyo/writeĿ¼�Ѵ��ڣ�");
		}
	}

	private static File file1 = new File("D:\\myio\\write\\write.txt");

	// ��"D:/myio/write.txt"���뵽"D:/myio/write/write.txt"��
	public static void writer1() {
		Reader rd = null;
		Writer wt = null;
		try {
			rd = new FileReader(file);
			wt = new FileWriter("D:/myio/write/write.txt", true);
			char ch[] = new char[1024];
			int length = 0;
			while ((length = rd.read(ch)) != -1) {
				wt.write(ch, 0, length);
				wt.flush();
				// wt.close();
				// rd.close();
			}
			System.out.println("�ַ�����ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��"D:/myio/write.txt"���뵽"D:/myio/write/write.txt"��
	public static void writer2() {
		Reader rd = null;
		Writer wt = null;
		try {
			rd = new FileReader(file);
			wt = new FileWriter("D:/myio/write/write.txt", true);
			char ch[] = new char[1024];
			int length = 0;
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, length);
				wt.flush();
				// wt.close();
				// rd.close();
			}
			System.out.println("�ַ�����ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// ��"D:/myio/write.txt"���뵽"D:/myio/write/write.txt"��
	public static void writer3() {
		Reader rd = null;
		Writer wt = null;
		try {
			rd = new FileReader(file);
			wt = new FileWriter("D:/myio/write/write.txt", true);
			char ch[] = new char[1024];
			int length = 0;
			while ((length = rd.read()) != -1) {
				wt.write((char) length);
				wt.flush();
				// wt.close();
				// rd.close();
			}
			System.out.println("�ַ�����ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		creatMyio();
		System.out.println("*****************************");
		creatWrite();
		System.out.println("*****************************");
		reader1();
		System.out.println("*****************************");
		reader2();
		System.out.println("*****************************");
		reader3();
		System.out.println("*****************************");

		creatMyio1();

		writer1();
		System.out.println("*****************************");
		writer2();
		System.out.println("*****************************");
		writer3();
		System.out.println("*****************************");
	}
}