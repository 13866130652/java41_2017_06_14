package zuoye1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 *1、使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
 *2、使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。
 *3、所有的文件、目录要求使用File语句进行创建。
 */
public class ReaderDemo {

	// 创建myio目录
	public static void creatMyio() {
		File file = new File("D:/myio");
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("创建myio目录成功！");
		} else {
			System.out.println("myio目录已存在！");
		}
	}

	// 创建write.txt文件并加入字符串“好好学习，天天向上”
	private static File file = new File("D:/myio/write.txt");

	public static void creatWrite() {
		// 创建write.txt文件
		boolean flag = false;
		if (!file.exists()) {
			try {
				Writer wt = new FileWriter(file);
				// 把字符串写到文件中
				String st = "好好学习，天天向上";
				wt.write(st);
				wt.flush();
				flag = true;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (flag) {
			System.out.println("创建write.txt目录成功！");
		} else {
			System.out.println("write.txt文件已存在！");
		}
	}

	// 一个字符一个字符读
	public static void reader1() {
		Reader is = null;
		int date = 0;
		try {
			is = new FileReader(file);
			while ((date = is.read()) != -1) {
				System.out.print((char) date);
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 读取数据到缓冲数组
	public static void reader2() {
		Reader is = null;
		char ch[] = new char[10];
		int length = 0;
		StringBuffer sb = new StringBuffer();
		try {
			is = new FileReader(file);
			while ((length = is.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					// System.out.print(ch[i]);
					sb.append(ch[i]);
				}
			}
			String st = sb.toString();// 转成String类型
			System.out.println(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 使用数组缓冲读取
	public static void reader3() {
		Reader is = null;
		char ch[] = new char[10];
		int length = 0;
		StringBuffer sb = new StringBuffer();
		try {
			is = new FileReader(file);
			while ((length = is.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < length; i++) {
					// System.out.print(ch[i]);
					sb.append(ch[i]);
				}
			}
			String st = sb.toString();// 转成String类型
			System.out.println(st);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 创建miyo/write目录
	public static void creatMyio1() {
		File file = new File("D:/myio/write");
		if (!file.exists()) {
			file.mkdirs();
			System.out.println("创建miyo/write目录成功！");
		} else {
			System.out.println("miyo/write目录已存在！");
		}
	}

	private static File file1 = new File("D:\\myio\\write\\write.txt");

	// 把"D:/myio/write.txt"输入到"D:/myio/write/write.txt"中
	public static void writer1() {
		Reader rd = null;
		Writer wt = null;
		try {
			rd = new FileReader(file);
			wt = new FileWriter("D:/myio/write/write.txt", true);
			char ch[] = new char[1024];
			int length = 0;
			while ((length = rd.read(ch)) != -1) {
				wt.write(ch, 0, length);
				wt.flush();
				// wt.close();
				// rd.close();
			}
			System.out.println("字符输入成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 把"D:/myio/write.txt"输入到"D:/myio/write/write.txt"中
	public static void writer2() {
		Reader rd = null;
		Writer wt = null;
		try {
			rd = new FileReader(file);
			wt = new FileWriter("D:/myio/write/write.txt", true);
			char ch[] = new char[1024];
			int length = 0;
			while ((length = rd.read(ch, 0, ch.length)) != -1) {
				wt.write(ch, 0, length);
				wt.flush();
				// wt.close();
				// rd.close();
			}
			System.out.println("字符输入成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 把"D:/myio/write.txt"输入到"D:/myio/write/write.txt"中
	public static void writer3() {
		Reader rd = null;
		Writer wt = null;
		try {
			rd = new FileReader(file);
			wt = new FileWriter("D:/myio/write/write.txt", true);
			char ch[] = new char[1024];
			int length = 0;
			while ((length = rd.read()) != -1) {
				wt.write((char) length);
				wt.flush();
				// wt.close();
				// rd.close();
			}
			System.out.println("字符输入成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		creatMyio();
		System.out.println("*****************************");
		creatWrite();
		System.out.println("*****************************");
		reader1();
		System.out.println("*****************************");
		reader2();
		System.out.println("*****************************");
		reader3();
		System.out.println("*****************************");

		creatMyio1();

		writer1();
		System.out.println("*****************************");
		writer2();
		System.out.println("*****************************");
		writer3();
		System.out.println("*****************************");
	}
}