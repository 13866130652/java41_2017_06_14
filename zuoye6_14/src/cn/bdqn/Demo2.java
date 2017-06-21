package cn.bdqn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer练习
public class Demo2 {
	private static File file = null;
	private static Writer wt = null;

	// 创建文件及文件夹
	static {
		file = new File("E:\\myOO\\write");
		if (!file.exists()) {
			if (file.mkdir()) {
				System.out.println("创建文件夹成功！");
			}
		} else {
			System.out.println("文件夹已存在！");
		}
		file = new File("E:\\myOO\\write\\write.txt");
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("创建文件成功！");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("文件已存在！");
		}
	}

	// 写入字符串
	public static void write1() {
		String name = "我要好好学习，天天向上！";
		try {
			wt = new FileWriter(file);
			wt.write(name);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 写入字符数组
	public static void write2() {
		String name = "我要好好学习，天天向上！";
		char[] ch = name.toCharArray();
		try {
			wt = new FileWriter(file);
			// cbuf - 字符数组
			// off - 开始写入字符处的偏移量
			// len - 要写入的字符数
			wt.write(ch, 0, ch.length - 5);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 写入字符串的某一部分
	public static void write3() {
		String name = "我要好好学习，天天向上！";
		try {
			wt = new FileWriter(file);
			// str - 字符串
			// off - 相对初始写入字符的偏移量
			// len - 要写入的字符数
			wt.write(name, 0, name.length() - 2);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// write1();
		// write2();
		write3();
	}
}
