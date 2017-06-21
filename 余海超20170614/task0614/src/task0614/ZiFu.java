package task0614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ZiFu {
	// 创建文件对象
	private static File file = new File("C:\\myio\\write.txt");
	private static File file0 = new File("C:\\myio\\write");
	private static File file1 = new File("C:\\myio\\write\\write.txt");
	// 创建输入、输出流对象
	private static Reader rd = null;
	private static Writer w = null;

	static {
		try {
			rd = new FileReader(file);
			w = new FileWriter(file1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 读、写方法一
	public static void write1() {
		try {
			int data = 0;
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);// 输出
				w.write((char) data);// 写入
				w.flush();// 刷新
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 方法二
	public static void write2() {
		char c[] = new char[8];
		int length = 0;
		try {
			while ((length = rd.read(c)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(c[i]);// 输出
					w.write(c[i]);
					w.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 方法二
	public static void write3() {
		char c[] = new char[8];
		int length = 0;
		try {
			while ((length = rd.read(c, 0, c.length)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(c[i]);// 输出
					w.write(c[i]);
					w.flush();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 关闭流
	public static void close() {
		try {
			if (rd != null && w != null) {
				rd.close();
				w.close();// 关闭资源
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// write1();
		// write2();
		write3();
		close();
	}

}
