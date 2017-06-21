package cn.bdqn8;

import java.io.File;
//1、使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
//2、使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。
//3、所有的文件、目录要求使用File语句进行创建。
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderTest {
	static Reader rd = null;
	static Writer wt = null;

	// 创建目录
	public static void mu(File file) {
		if (!file.exists()) {
			file.mkdirs();
		} else {
			System.out.println(file + "目录创建成功！");
		}
	}

	// 创建文件
	public static void wj(File file) {
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(file + "文件创建成功！");
		}
	}

	// 读取方法1
	public static void reader1() {
		int data = 0;
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			while ((data = rd.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 读取方法2
	public static void reader2() {
		int length = 0;
		char[] ch = new char[1024];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 读取方法3
	public static void reader3() {
		int length = 0;
		char[] ch = new char[1];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 把读取字符写入到D:\myio\write\write.txt文件中1
	public static void writer1() {
		int data = 0;
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			wt = new FileWriter("D:\\myio\\write\\write.txt");
			while ((data = rd.read()) != -1) {
				wt.write(data);
				wt.flush();
			}

		} catch (Exception e) {
		}
	}

	// 把读取字符写入到D:\myio\write\write.txt文件中2
	public static void writer2() {
		int length = 0;
		char[] ch = new char[1024];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			wt = new FileWriter("D:\\myio\\write\\write.txt");
			while ((length = rd.read(ch)) != -1) {
				wt.write(ch);
				wt.flush();
			}

		} catch (Exception e) {
		}
	}

	// 把读取字符写入到D:\myio\write\write.txt文件中3
	public static void writer3() {
		int length = 0;
		char[] ch = new char[1024];
		try {
			rd = new FileReader("D:\\myio\\write.txt");
			wt = new FileWriter("D:\\myio\\write\\write.txt");
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, length);
				wt.flush();
			}

		} catch (Exception e) {
		}
	}

	// 关闭资源
	public static void close() {
		if (wt != null) {
			try {
				wt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rd != null) {
			try {
				rd.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		mu(new File("D:\\myio"));
		wj(new File("D:\\myio\\write.txt"));
		reader1();
		// reader2();
		// reader3();
		mu(new File("D:\\myio\\write"));
		wj(new File("D:\\myio\\write\\write.txt"));
		writer1();
		// writer2();
		// writer3();
		close();
	}

}
