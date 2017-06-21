package cn.bdqn;

//Reader练习
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

//使用Reader的三种方法读取
//文件D:\myio\write.txt的文本字符，输出到控制台。
public class Demo1 {
	private static File f = null;
	private static Writer wt = null;
	private static Reader rd = null;
	private static char[] ch = new char[5];
	// java虚拟机加载该类的时候会首先运行static代码块
	static {
		f = new File("E:\\myOO");
		if (!f.exists()) {
			if (f.mkdir()) {
				System.out.println("创建文件夹成功！");
			}
		} else {
			System.out.println("该文件夹已存在！");
		}
		f = new File("E:\\myOO\\write.txt");
		if (!f.exists()) {
			try {
				if (f.createNewFile()) {
					System.out.println("创建文件成功！");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("该文件已存在！");
		}
	}

	// 1.往write.txt文件中写入内容
	public static void write() {
		System.out.println("请输入一段话：");
		String word = new Scanner(System.in).next();
		try {
			wt = new FileWriter(f);
			wt.write(word);
			wt.flush();
			wt.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 2.单个字符读取write.txt文件中的内容
	// 读取单个字符
	public static void read1() {
		try {
			rd = new FileReader(f);
			int length = 0;
			int num = 0;
			try {
				while ((length = rd.read()) != -1) {
					num++;
					System.out.print((char) length);
				}
				System.out.println("有：" + num + "个字符");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 3.字符串读取write.txt文件中的内容
	// 将字符读入数组
	public static void read2() {
		try {
			rd = new FileReader(f);
			int length = 0;
			int sum = 0, num = 0;// 计数
			try {
				// read()表示读取的字符数，如果已到达流的末尾，则返回 -1
				while ((length = rd.read(ch)) != -1) {
					for (int i = 0; i < length; i++) {
						num++;
						System.out.print(ch[i]);
					}
					System.out.println("有：" + num + "个字符");
					sum += num;
					num = 0;
				}
				System.out.println("总共有：" + sum + "个字符");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	// 4.指定字符串长度读取write.txt文件中的内容,
	// 将字符读入数组的某一部分。
	public static void read3() {
		try {
			rd = new FileReader(f);
			int length = 0, sum = 0;
			try {
				while ((length = rd.read(ch, 0, ch.length - 2)) != -1) {
					// ch表示目标缓存区，0表示开始储存的目标偏移量
					// ，len表示要读取的最多字符数
					for (int i = 0; i < length; i++) {
						System.out.print(ch[i]);

					}
					sum += length;
				}
				System.out.println("总共有：" + sum + "字符");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		write();
		// read1();
		// read2();
		read3();
	}
}
