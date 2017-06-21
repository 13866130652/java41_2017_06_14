package cn.bdqn;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriterDemo {

	static File fileOrigin = new File(
			"F:\\Project\\Classwork31\\src\\cn\\bdqn\\fileOrigin.txt");;
	static File fileObject = new File(
			"F:\\Project\\Classwork31\\src\\cn\\bdqn\\fileObject.txt");;

	// reader方法,读取源文件中的字符内容,并输出到控制台
	public static void reader1() {

		try {
			Reader rd = new FileReader(fileOrigin);
			int date = 0;
			// 一个一个的输出
			System.out.println("reader1:");
			while ((date = rd.read()) != -1) {
				System.out.print((char) date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// reader方法,读取源文件中的字符内容,并输出到控制台
	public static void reader2() {
		try {
			Reader rd = new FileReader(fileOrigin);
			char[] ch = new char[3];
			int length = 0;
			// 以一个字符数组的长度为基本单位输出,不足另作特殊处理
			System.out.println("reader2:");
			while ((length = rd.read(ch)) != -1) {
				// 读多少,输出多少,避免了一些不必要的麻烦
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// reader方法,读取源文件中的字符内容,并输出到控制台
	public static void reader3() {
		try {
			Reader rd = new FileReader(fileOrigin);
			char[] ch = new char[3];
			int length = 0;
			// 以不大于一个字符数组的长度为基本单位输出,不足另作特殊处理
			System.out.println("reader3:");
			while ((length = rd.read(ch, 0, 2)) != -1) {// 截取
				// 读多少,输出多少,避免了一些不必要的麻烦
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 边读边写
	public static void copy1(File file1, File file2) {
		try {
			Reader rd = new FileReader(file2);
			Writer wt = new FileWriter(file1);
			int length = 0;
			char[] ch = new char[3];
			while ((length = rd.read(ch)) != -1) {
				wt.write(ch, 0, length);// 截取此次读入数组中的内容
			}
			wt.flush();
			wt.close();
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void copy2(File file1, File file2) {
		try {
			Reader rd = new FileReader(file2);
			Writer wt = new FileWriter(file1);
			int length = 0;
			// 读一个写一个
			while ((length = rd.read()) != -1) {
				wt.write(length);//
			}
			wt.flush();
			wt.close();
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void copy3(File file1, File file2) {
		StringBuffer sb = new StringBuffer();
		try {
			Reader rd = new FileReader(file2);
			Writer wt = new FileWriter(file1);
			int length = 0;
			char[] ch = new char[3];
			while ((length = rd.read(ch)) != -1) {
				// 读多少,输出多少,避免了一些不必要的麻烦
				for (int i = 0; i < length; i++) {
					sb.append(ch[i]);
				}

			}
			String st = sb.toString();
			wt.write(st);
			wt.flush();
			wt.close();
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 边读边写
	public static void copy4(File file1, File file2) {
		try {
			Reader rd = new FileReader(file2);
			Writer wt = new FileWriter(file1);
			int length = 0;
			char[] ch = new char[3];
			while ((length = rd.read(ch, 0, 3)) != -1) {// 最大读三个字符到数组
				wt.write(ch, 0, length);// 截取此次读入数组中的内容
			}
			wt.flush();
			wt.close();
			rd.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		// reader1();
		// reader2();
		// reader3();
		// copy1(fileObject, fileOrigin);
		// copy2(fileObject, fileOrigin);
		// copy3(fileObject, fileOrigin);
		copy4(fileObject, fileOrigin);

	}

}
