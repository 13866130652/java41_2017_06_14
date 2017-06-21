package cn.work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

//使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
public class Work {
	private static File fl1 = new File("D:/myio/write1.txt");
	private static Reader re = null;

	static {
		File fl = new File("D:/myio/write.txt");
		try {
			if (!fl.exists()) {
				fl.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Reader re1 = new FileReader(fl1);
			Writer wr = new FileWriter(fl);
			int date = 0;
			while ((date = re1.read()) != -1) {
				wr.write(date);
				wr.flush();
			}
			wr.close();
			re1.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			re = new FileReader(fl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void read1() {
		try {
			int date = 0;
			while ((date = re.read()) != -1) {
				System.out.print((char) date);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read2() {
		int lenght = 0;
		char[] ch = new char[1024];
		try {
			
			while ((lenght = re.read(ch)) != -1) {
				for (int i = 0; i < ch.length; i++)
					if (ch[i] != 0) {
						System.out.print(ch[i]);
					}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void read3() {
		int lenght = 0;
		char[] ch = new char[1024];
		try {
			while ((lenght = re.read(ch, 2, ch.length - 2)) != -1) {
				for (int i = 0; i < ch.length; i++)
					if (ch[i] != 0) {
						System.out.print(ch[i]);
					}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			re.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// read1();
		// read2();
		read3();
		close();
	}

}
