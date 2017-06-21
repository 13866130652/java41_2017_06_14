package cn.zuoye3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;

public class ReaderDemo {
	/**
	 * Reader��һ�ַ��� ������
	 * 
	 * @param f
	 */
	public static void getRead1(File f) {
		FileReader fr = null;
		String s = "";
		try {
			fr = new FileReader(f);
			int d = 0;
			while ((d = fr.read()) != -1) {
				s = s + (char) d;
			}
			System.out.println("��ȡ�ɹ���" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Reader�ڶ��ַ��� �������黺��
	 * 
	 * @param f
	 */
	public static void getRead2(File f) {
		FileReader fr = null;
		String s = "";
		char[] ch = new char[1024];
		try {
			fr = new FileReader(f);
			int d = 0;
			while ((d = fr.read(ch)) != -1) {
				for (int i = 0; i < d; i++) {
					s = s + ch[i];
				}
			}
			System.out.println("��ȡ�ɹ���" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Reader�����ַ��� �������黺��
	 * 
	 * @param f
	 */
	public static void getRead3(File f) {
		FileReader fr = null;
		String s = "";
		char[] ch = new char[1024];
		try {
			fr = new FileReader(f);
			int d = 0;
			while ((d = fr.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < d; i++) {
					s = s + ch[i];
				}
			}
			System.out.println("��ȡ�ɹ���" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ��д1
	 * 
	 * @param a
	 * @param b
	 */
	public static void getWrite1(File a, File b) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(a);
			fw = new FileWriter(b);
			int d = 0;
			while ((d = fr.read()) != -1) {
				fw.write(d);
			}
			System.out.println("���Ƴɹ�");
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ��д2
	 * 
	 * @param a
	 * @param b
	 */
	public static void getWrite2(File a, File b) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] ch = new char[1024];
		try {
			fr = new FileReader(a);
			fw = new FileWriter(b);
			int d = 0;
			while ((d = fr.read(ch)) != -1) {
				fw.write(ch);// ���ܻ�������һ������û�ж�����������һ�β���
			}
			fw.flush();
			System.out.println("���Ƴɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ��д3
	 * 
	 * @param a
	 * @param b
	 */
	public static void getWrite3(File a, File b) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] ch = new char[16];
		try {
			fr = new FileReader(a);
			fw = new FileWriter(b);
			int d = 0;
			String s = "";
			while ((d = fr.read(ch)) != -1) {
				fw.write(ch, 0, d);
			}
			fw.flush();
			System.out.println("���Ƴɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ����Ŀ¼
	 * 
	 * @param m
	 */
	public static void cjml(File m) {
		if (!m.exists()) {
			m.mkdirs();
			System.out.println("����Ŀ¼�ɹ�");
		} else {
			System.out.println("Ŀ¼�Ѿ�����");
		}
	}

	/**
	 * �����ļ�
	 * 
	 * @param m
	 */
	public static void cjwj(File m) {
		boolean flag = false;
		if (!m.exists()) {
			try {
				flag = m.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (flag) {
				System.out.println("�����ļ��ɹ�");
			} else {
				System.out.println("�����ļ�ʧ��");
			}
		} else {
			System.out.println("�ļ��Ѿ�����");
		}
	}

	public static void xieru(File f, String s) {
		FileWriter fr = null;
		BufferedWriter bw = null;
		try {
			fr = new FileWriter(f);
			bw = new BufferedWriter(fr);
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		File f1 = new File("D:/����дд");
		File f2 = new File("D:/����дд/bobo.txt");
		File f3 = new File("D:/����дд/lili.txt");
		String s = "���ǽ��Ϻ÷羰���仨ʱ���ַ��";
		cjml(f1);// ����Ŀ¼
		cjwj(f2);// �����ļ�
		xieru(f2, s);// д������
		getRead3(f2);// ��ȡ�ļ�
		getWrite3(f2, f3);// �����ļ�����
	}

}
