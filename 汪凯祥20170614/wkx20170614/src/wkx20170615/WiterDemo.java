package wkx20170615;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
 *
 */
public class WiterDemo {
	private static File f = new File("D:\\myio\\write.txt");
	private static Writer wt = null;

	// �ַ���
	public static void witer1() {
		try {
			wt = new FileWriter(f, true);
			String st = "��������������";
			wt.write(st);
			wt.flush();
			wt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ַ�����
	public static void witer2() {
		try {
			wt = new FileWriter(f, true);
			String st = "��������������";
			char ch[] = st.toCharArray();
			wt.write(ch);
			wt.flush();
			wt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// �ַ�����
	public static void witer3() {
		try {
			wt = new FileWriter(f, true);
			String st = "��������������";
			char ch[] = st.toCharArray();
			wt.write(ch, 0, ch.length);
			wt.flush();
			wt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// witer1();
		// witer2();
		witer3();

	}

}
