package cn.work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
//使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中
public class Work1 {
	private static File fl = new File("D:/myio/write.txt");
	private static Reader re = null;
	public static Writer wr = null;

	static {
		File fl1 = new File("D:\\myio\\write");
		if (!fl1.exists()) {
			fl1.mkdir();
		}
		try {
			re = new FileReader(fl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			wr = new FileWriter("D:\\myio\\write\\write.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void write() {
		try {
			int lenght = 0;
			char[] ch = new char[1024];
			while ((lenght = re.read(ch)) != -1) {
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] != 0) {
						wr.write(ch[i]);
					}
				}
				wr.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void write1() {
		try {
			int date = 0;
			while ((date = re.read()) != -1) {
				wr.write(date);
				wr.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void write2() {
		try {
			int lenght = 0;
			char[] ch = new char[1024];
			StringBuffer sb = new StringBuffer();
			while ((lenght = re.read(ch)) != -1) {
				for (int i = 0; i < ch.length; i++) {
					if (ch[i] != 0) {
						sb.append(ch[i]);
					}
				}
			}
			wr.write(sb.toString(), 5, sb.toString().length() - 5);
			wr.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void close() {
		try {
			if (wr != null) {
				wr.close();
			}
			if (re != null) {
				re.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// write();
		// write1();
		write2();
		close();
	}

}
