package cn.bdqn;

//Reader��ϰ
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

//ʹ��Reader�����ַ�����ȡ
//�ļ�D:\myio\write.txt���ı��ַ������������̨��
public class Demo1 {
	private static File f = null;
	private static Writer wt = null;
	private static Reader rd = null;
	private static char[] ch = new char[5];
	// java��������ظ����ʱ�����������static�����
	static {
		f = new File("E:\\myOO");
		if (!f.exists()) {
			if (f.mkdir()) {
				System.out.println("�����ļ��гɹ���");
			}
		} else {
			System.out.println("���ļ����Ѵ��ڣ�");
		}
		f = new File("E:\\myOO\\write.txt");
		if (!f.exists()) {
			try {
				if (f.createNewFile()) {
					System.out.println("�����ļ��ɹ���");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("���ļ��Ѵ��ڣ�");
		}
	}

	// 1.��write.txt�ļ���д������
	public static void write() {
		System.out.println("������һ�λ���");
		String word = new Scanner(System.in).next();
		try {
			wt = new FileWriter(f);
			wt.write(word);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2.�����ַ���ȡwrite.txt�ļ��е�����
	// ��ȡ�����ַ�
	public static void read1() {
		try {
			rd = new FileReader(f);
			int length = 0;
			int num = 0;
			try {
				while ((length = rd.read()) != -1) {
					num++;
					System.out.print((char) length);
				}
				System.out.println("�У�" + num + "���ַ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 3.�ַ�����ȡwrite.txt�ļ��е�����
	// ���ַ���������
	public static void read2() {
		try {
			rd = new FileReader(f);
			int length = 0;
			int sum = 0, num = 0;// ����
			try {
				// read()��ʾ��ȡ���ַ���������ѵ�������ĩβ���򷵻� -1
				while ((length = rd.read(ch)) != -1) {
					for (int i = 0; i < length; i++) {
						num++;
						System.out.print(ch[i]);
					}
					System.out.println("�У�" + num + "���ַ�");
					sum += num;
					num = 0;
				}
				System.out.println("�ܹ��У�" + sum + "���ַ�");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// 4.ָ���ַ������ȶ�ȡwrite.txt�ļ��е�����,
	// ���ַ����������ĳһ���֡�
	public static void read3() {
		try {
			rd = new FileReader(f);
			int length = 0, sum = 0;
			try {
				while ((length = rd.read(ch, 0, ch.length - 2)) != -1) {
					// ch��ʾĿ�껺������0��ʾ��ʼ�����Ŀ��ƫ����
					// ��len��ʾҪ��ȡ������ַ���
					for (int i = 0; i < length; i++) {
						System.out.print(ch[i]);

					}
					sum += length;
				}
				System.out.println("�ܹ��У�" + sum + "�ַ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		write();
		// read1();
		// read2();
		read3();
	}
}
