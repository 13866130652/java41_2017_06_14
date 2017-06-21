package zuoye20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderDemo {
	// 1.����File����
	public static File file = new File("E:\\myio");
	public static File file1 = new File("E:\\myio\\write.txt");
	public static File file2 = new File("E:\\myio\\write");
	public static File file3 = new File("E:\\myio\\write\\write.txt");

	// 2.�ж�Ŀ¼�Ƿ����
	public static void ml(File a) {
		if (a.exists()) {
			System.out.println("Ŀ¼�Ѵ���");
		} else {
			a.mkdirs();
			System.out.println("Ŀ¼�����ɹ�");
		}
	}

	// 3.�ж��ļ��Ƿ����
	public static void wj(File a) {
		if (a.exists()) {
			System.out.println("�ļ��Ѵ���");
		} else {
			try {
				a.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("�ļ������ɹ�");
		}
	}

	// 4.ʹ��read()�ķ�����ȡE:\\myio\\write.txt���ı��ַ�
	public static String sc1(File g) {
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(g);
			while ((index = a.read()) != -1) {
				d += (char) index;
			}
			System.out.println("��һ�ַ���:" + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	// 5.ʹ��Read(char[] c)�ķ�����ȡE:\\myio\\write.txt���ı��ַ�
	public static String sc2(File g) {
		char c[] = new char[1024];
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(g);
			while ((index = a.read(c)) != -1) {
				for (int i = 0; i < index; i++) {
					d += c[i];
				}
			}
			System.out.println("�ڶ��ַ���:" + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	// 6.ʹ��Read(char[] c��int off,int len)�ķ�����ȡE:\\myio\\write.txt���ı��ַ�
	public static String sc3(File g) {
		char c[] = new char[1024];
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(g);
			while ((index = a.read(c, 0, c.length)) != -1) {
				for (int i = 0; i < index; i++) {
					d += c[i];
				}
			}
			System.out.println("�����ַ���:" + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	// 7.ʹ��write(String str)�ķ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
	public static String sc() {
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(file1);
			while ((index = a.read()) != -1) {
				d += (char) index;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public static void xr1() {
		try {
			Writer a = new FileWriter(file3);
			String b = sc();
			a.write(b);
			a.flush();
			if (a != null) {
				a.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 8.ʹ��write(char ch[])�ķ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
	public static void xr2() {
		try {
			Writer a = new FileWriter(file3, true);
			String b = sc();
			char ch[] = b.toCharArray();
			a.write(ch);
			a.flush();
			if (a != null) {
				a.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 9.ʹ��write(char ch[],int off,int len)�ķ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
	public static void xr3() {
		try {
			Writer a = new FileWriter(file3, true);
			String b = sc();
			char ch[] = b.toCharArray();
			a.write(ch, 0, ch.length);
			a.flush();
			if (a != null) {
				a.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 1.����E:\\myioĿ¼
		ml(file);
		// 2.����E:\\myio\\write.txt�ļ�
		wj(file1);
		// 3.ʹ��read()�ķ�����ȡE:\\myio\\write.txt���ı��ַ�
		sc1(file1);
		// 4.ʹ��Read(char[] c)�ķ�����ȡE:\\myio\\write.txt���ı��ַ�
		sc2(file1);
		// 5.ʹ��Read(char[] c��int off,int len)�ķ�����ȡE:\\myio\\write.txt���ı��ַ�
		sc3(file1);
		// 6.����E:\\myio\\write��Ŀ¼
		ml(file2);
		// 7.����E:\\myio\\write\\write.txt���ļ�
		wj(file3);
		// 8.ʹ��write(String str)�ķ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
		xr1();
		// 9.ʹ��write(char ch[])�ķ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
		xr2();
		// 10.ʹ��write(String str,int
		// off,intlen)�ķ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ���
		xr3();
	}

}
