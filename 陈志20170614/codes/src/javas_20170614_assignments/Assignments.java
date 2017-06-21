/**
 * 
 */
package javas_20170614_assignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * @author Zhi Chen
 *
 */
public class Assignments {

	private static File file = new File("C:\\myio\\20170614_A\\write.txt");
	private static File file1 = new File("C:\\myio\\20170614_A\\write");
	private static File file2 = new File("C:\\myio\\20170614_A\\write\\write.txt");
	private static Reader re = null;
	private static Writer wt = null;

	static {
		// ����write�ļ�,C:\\myio\\20170614_A\\write,
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѵ���");
		}

		if (!file1.exists()) {
			try {
				file1.mkdir();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ����Ѵ���");
		}

		if (!file2.exists()) {
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѵ���");
		}

		try {
			wt = new FileWriter(file2, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��ȡ�����ַ�
	public static void read1() {
		try {
			re = new FileReader(file);
			int date = 0;
			while ((date = re.read()) != -1) {
				System.out.print((char) date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ���ַ���������
	public static void read2() {
		char[] ch = new char[8];
		try {
			re = new FileReader(file);
			int length = 0;
			while ((length = re.read(ch)) != -1) {
				System.out.println(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// ���ַ����������ĳһ����
	public static void read3(int off, int len) {
		try {
			re = new FileReader(file);
			char[] ch = new char[1024];
			re.read(ch, off, len);
			System.out.println(ch);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Writer����1
	public static void write1() {
		try {
			wt = new FileWriter(file2);
			String st = "jdkeoernd";
			// ���ַ���д���ļ���
			wt.write(st);
			wt.flush();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Writer����2
	public static void write2() {
		String st = "2.�ú�ѧϰ����������";
		char ch[] = st.toCharArray();
		try {
			wt.write(ch);
			wt.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Writer����3
	public static void write3() {
		String st = "1234567";
		char[] ch = st.toCharArray();
		try {
			wt.write(ch, 5, st.length() - 5);
			wt.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �ر�reader()
	public static void closeReader() {
		try {
			if (re != null) {
				re.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// �ر�writer()
	public static void closeWriter() {
		try {
			if (wt != null) {
				wt.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// read1();
		// read2();
		// ��������0��λ�ÿ�ʼ����
		// read3(0, 20);
		// closeReader();

		// write1();
		// write2();
		// write3();
		// closeWriter();

	}
}
