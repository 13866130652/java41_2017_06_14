package cn.readerAndWriter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class rw_Demo {

	private static File directory = new File("D:\\myio");
	private static File subDir = new File("D:\\myio\\write");
	private static File file = new File("D:\\myio\\write.txt");
	private static File file1 = new File("D:\\myio\\write\\write.txt");

	/**
	 * 创建文件夹D:\myio\
	 */
	public static void createDirectory() {
		if (!directory.exists()) {
			directory.mkdirs();
			System.out.println("创建文件夹成功！");
		} else {
			System.out.println("文件夹已存在！");
		}
	}

	/**
	 * 创建文件夹D:\myio\write
	 */
	public static void createSubDir() {
		if (!subDir.exists()) {
			subDir.mkdirs();
			System.out.println("创建文件夹成功！");
		} else {
			System.out.println("文件夹已存在！");
		}
	}

	/**
	 * D:\myio\中创建文件write.txt，文件内容自己写入
	 */
	public static void createFile() {
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("创建文件成功！");
			} else {
				System.out.println("文件已存在！");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 读取文件，方法1，一个一个字符读
	 */
	public static void reader1() {
		try {
			Reader rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 缓冲数组
	private static char[] ch = new char[1024];

	/**
	 * 读取文件，方法2,加入缓冲数组，一段一段读，一个一个输出
	 */
	public static void reader2() {
		try {
			Reader rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print((char) ch[i]);
				}
			}
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 读取文件，方法3,加入缓冲数组，一段一段读，一个一个输出
	 */
	public static void reader3() {
		try {
			Reader rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print((char) ch[i]);
				}
			}
			rd.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写入文件，方法1，一个一个的读取，写入
	 */
	public static void writer1() {
		try {
			Reader rd = new FileReader(file);
			Writer wt = new FileWriter(file1, false);
			int data = 0;
			while ((data = rd.read()) != -1) {
				wt.write(data);
			}
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写入文件，方法2，一段一段读取，一个一个写入
	 */
	public static void writer2() {
		try {
			Reader rd = new FileReader(file);
			Writer wt = new FileWriter(file1, false);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					wt.write(ch[i]);
				}
			}
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 写入文件，方法3，一段一段读取，一段一段写入
	 */
	public static void writer3() {
		try {
			Reader rd = new FileReader(file);
			Writer wt = new FileWriter(file1, false);
			int data = 0;
			while ((data = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, data);
			}
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 创建目录
		createDirectory();
		// 创建子目录
		createSubDir();
		// 创建文件
		createFile();
		// 读取文件
		// reader1();
		// reader2();
		reader3();
		// 写入文件
		// writer1();
		// writer2();
		writer3();
	}
}
