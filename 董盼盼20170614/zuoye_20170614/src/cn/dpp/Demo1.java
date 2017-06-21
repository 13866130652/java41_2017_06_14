package cn.dpp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class Demo1 {
	// 创建File对象
	private static File file = new File("D:\\myio\\write");
	private static File file1 = new File("D:\\myio\\write.txt");
	private static File file2 = new File("D:\\myio\\write\\write.txt");
	// 创建输入、输出流对象
	private static Reader rd = null;
	private static Writer wt = null;
	// 创建缓冲数组
	private static char ch[] = new char[1024];

	// 创建目录
	public static void mkdir1(File file) {
		if (!file.exists()) {
			file.mkdirs();
			System.out.println(file.getPath() + "已创建!");
		} else {
			System.out.println(file.getPath() + "已存在!");
		}
	}

	// 创建文件
	public static void mkdir2(File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(file.getPath() + "已创建!");

		} else {
			System.out.println(file.getPath() + "已存在!");
		}
	}

	// 每次读取单个数据输出到控制台
	public static void read1(File file) {
		try {
			rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 读取数据到数组中输出到控制台
	public static void read2(File file) {
		try {
			rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 读取数据到指定的数组区间中输出到控制台
	public static void read3(File file) {
		try {
			rd = new FileReader(file);
			int data = 0;
			while ((data = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < data; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 把字符串输入到文件中
	public static void write1(File file1, File file2) {
		try {
			rd = new FileReader(file1);
			wt = new FileWriter(file2);
			StringBuffer sb = new StringBuffer();
			int data = 0;
			while ((data = rd.read()) != -1) {
				sb.append((char) data);
			}
			String st = sb.toString();
			wt.write(st);
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 把字符数组输入到文件中
	public static void write2(File file1, File file2) {
		try {
			rd = new FileReader(file1);
			wt = new FileWriter(file2);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				for (int i = 0; i < data; i++) {
					wt.write(ch[i]);
				}
			}
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 把指定的字符数组区间输入到文件中
	public static void write3(File file1, File file2) {
		try {
			rd = new FileReader(file1);
			wt = new FileWriter(file2);
			int data = 0;
			while ((data = rd.read(ch)) != -1) {
				wt.write(ch, 0, data);
			}
			wt.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	// 关闭流
	public static void close() {
		try {
			if (wt != null) {
				wt.close();
			}
			if (rd != null) {
				rd.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		mkdir1(file);
		mkdir2(file1);
		mkdir2(file2);
		read1(file1);
		read2(file1);
		read3(file1);
		write1(file1, file2);
		write2(file1, file2);
		write3(file1, file2);
		close();
	}
}
