package homework20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 1��ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
 * 2��ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С� 3�����е��ļ���Ŀ¼Ҫ��ʹ��File�����д�����
 * 
 */
public class HomeWork1 {
	static File file = new File("D:\\myio\\write.txt");// �����ļ�����
	static File dir = new File("D:\\myio");// �����ļ�����
	static File file1 = new File("D:\\myio\\write\\write.txt");
	static File dir1 = new File("D:\\myio\\write");// �����ļ�����

	public static void main(String[] args) {
		char ch[] = new char[7];
		char ch1[] = new char[8];
		CJML(dir);
		CJML(dir1);
		CJWJ(file);
		CJWJ(file1);
		Write1("�Ұ������찲��", "D:\\myio\\write\\write.txt");
		Write2("��ϧ�찲�Ų�����", "D:\\myio\\write.txt", 0, 8);
		Reader3("D:\\myio\\write\\write.txt", ch, 0, 7);
		Reader1("D:\\myio\\write.txt");
		Reader2(file.toString(), ch1);
	}

	public static void CJML(File f) {
		if (!f.exists()) {// ����ļ��в�����
			if (f.mkdirs()) {// ��������ɹ�
				System.out.println("�����ļ��гɹ�");
			} else {
				System.out.println("�����ļ���ʧ��");
			}
		} else {
			System.out.println("Ŀ¼�Ѵ���");
		}
	}

	public static void CJWJ(File f) {
		if (!f.exists()) {
			try {
				if (f.createNewFile()) {
					System.out.println("�����ļ��ɹ�");
				} else {
					System.out.println("����ʧ��");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ļ��Ѵ���");
		}
	}

	// ʹ��Writer�����ַ����Ѷ�ȡ�ַ�д�뵽D:\myio\write\write.txt�ļ��С�
	public static void Write1(String s, String s2) {
		Writer fw = null;// ����Writer����
		try {
			fw = new FileWriter(s2);
			fw.write(s);// ��ʵ���е�����д��������
			fw.flush();// ˢ�»�����
			System.out.println("д��ɹ�");
		} catch (Exception e) {
			System.out.println("�ļ�������");
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Write2(String nr, String wj, int off, int len) {
		Writer fw = null;// ����Writer����
		try {
			fw = new FileWriter(wj);
			fw.write(nr, off, len);// ��str�ַ������offλ�ÿ�ʼ����Ϊlen���ַ�������������
			fw.flush();// ˢ�»�����
			System.out.println("д��ɹ�");
		} catch (Exception e) {
			System.out.println("�ļ�������");
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// ʹ��Reader�����ַ�����ȡ�ļ�D:\myio\write.txt���ı��ַ������������̨��
	public static void Reader1(String wj) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader(wj);
			char ch[] = new char[8];// �����ַ�������Ϊ��תվ
			sbf = new StringBuffer();// ����StringBuffer����
			int length = 0;// ���ַ���������
			while (fr.read(ch) != -1) {// ��length������-1
				length = fr.read();// ��ȡ�����ַ�
				sbf.append(ch);// ƴ���ַ�
			}
			System.out.println(sbf);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Reader2(String wj, char ch[]) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader(wj);
			sbf = new StringBuffer();// ����StringBuffer����
			int length = 0;// ���ַ���������
			while (fr.read(ch) != -1) {// ��length������-1
				length = fr.read();// ��ȡ�����ַ�
				sbf.append(ch);// ƴ���ַ�
			}
			System.out.println(sbf);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Reader3(String wj, char ch[], int off, int len) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader(wj);
			sbf = new StringBuffer();// ����StringBuffer����
			fr.read(ch, off, len);// ��ȡ�����ַ�
			System.out.println(ch);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
