package zuoye20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ZuoYe1 {

	// �������������
	static Writer wt = null;

	// ����Ŀ¼
	public static void h() {
		File dir = new File("E:\\File");
		if (!dir.exists()) {
			dir.mkdir();
		} else {
			System.out.println("�ļ�Ŀ¼�Ѵ���");
		}
	}

	// ��һ�ַ���
	public static void read1() {
		// ȷ��Դ�ļ�
		File file = new File("E:\\File\\lala.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();// ����Ƿ��д��ļ�
			} catch (Exception e) {
			}
		}

		char ch[] = new char[5];
		StringBuffer sb = new StringBuffer();
		try {
			wt = new FileWriter(file, true);// true��ʾƴ��ԭ���ַ���
			String st = "Ӣ������,";
			wt.write(st);// ���ַ���д���ļ���
			wt.flush();// ��ջ���
			Reader rd = new FileReader(file);
			int length = 0;
			// rd����ȡÿ��length���ȵ��ַ���ch������
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
					sb.append(ch[i]);
				}
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	// �ڶ��ַ���
	public static void read2() {
		// 1.ȷ��Դ�ļ�
		File file = new File("E:\\File\\lala.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
			}
		}

		String st = "�ٻ�ʦϿ��,";
		char ch[] = st.toCharArray();// ���ַ���ת��Ϊ�ַ�����
		Reader rd = null;
		try {
			wt = new FileWriter(file, true);
			wt.write(ch);
			wt.flush();
			rd = new FileReader(file);
			int date = 0;
			while ((date = rd.read()) != -1) {
				System.out.print((char) date);
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// �����ַ���
	public static void read3() {
		File file = new File("E:\\File\\lala.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String st = "�Ͻ�����֮�գ���ʿ����֮ʱ��";
		char a[] = st.toCharArray();// ���ַ���ת��Ϊ�ַ�����
		char ch[] = new char[14];
		int length = 0;
		try {
			wt = new FileWriter(file, true);
			wt.write(a, 0, 14);// ��ͷ��ʼ��д����Ϊ14�ĵ�a����
			wt.flush();
			Reader rd = new FileReader(file);
			while ((length = rd.read(ch, 0, 14)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �ر���Դ
	public static void close() {
		try {
			wt.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read1();
		read2();
		read3();
		close();
	}

}
