package zuoye20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderDemo {
	// 1.创建File对象
	public static File file = new File("E:\\myio");
	public static File file1 = new File("E:\\myio\\write.txt");
	public static File file2 = new File("E:\\myio\\write");
	public static File file3 = new File("E:\\myio\\write\\write.txt");

	// 2.判断目录是否存在
	public static void ml(File a) {
		if (a.exists()) {
			System.out.println("目录已存在");
		} else {
			a.mkdirs();
			System.out.println("目录创建成功");
		}
	}

	// 3.判断文件是否存在
	public static void wj(File a) {
		if (a.exists()) {
			System.out.println("文件已存在");
		} else {
			try {
				a.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("文件创建成功");
		}
	}

	// 4.使用read()的方法读取E:\\myio\\write.txt的文本字符
	public static String sc1(File g) {
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(g);
			while ((index = a.read()) != -1) {
				d += (char) index;
			}
			System.out.println("第一种方法:" + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	// 5.使用Read(char[] c)的方法读取E:\\myio\\write.txt的文本字符
	public static String sc2(File g) {
		char c[] = new char[1024];
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(g);
			while ((index = a.read(c)) != -1) {
				for (int i = 0; i < index; i++) {
					d += c[i];
				}
			}
			System.out.println("第二种方法:" + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	// 6.使用Read(char[] c，int off,int len)的方法读取E:\\myio\\write.txt的文本字符
	public static String sc3(File g) {
		char c[] = new char[1024];
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(g);
			while ((index = a.read(c, 0, c.length)) != -1) {
				for (int i = 0; i < index; i++) {
					d += c[i];
				}
			}
			System.out.println("第三种方法:" + d);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	// 7.使用write(String str)的方法把读取字符写入到D:\myio\write\write.txt文件中
	public static String sc() {
		int index = 0;
		String d = "";
		try {
			Reader a = new FileReader(file1);
			while ((index = a.read()) != -1) {
				d += (char) index;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return d;
	}

	public static void xr1() {
		try {
			Writer a = new FileWriter(file3);
			String b = sc();
			a.write(b);
			a.flush();
			if (a != null) {
				a.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 8.使用write(char ch[])的方法把读取字符写入到D:\myio\write\write.txt文件中
	public static void xr2() {
		try {
			Writer a = new FileWriter(file3, true);
			String b = sc();
			char ch[] = b.toCharArray();
			a.write(ch);
			a.flush();
			if (a != null) {
				a.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 9.使用write(char ch[],int off,int len)的方法把读取字符写入到D:\myio\write\write.txt文件中
	public static void xr3() {
		try {
			Writer a = new FileWriter(file3, true);
			String b = sc();
			char ch[] = b.toCharArray();
			a.write(ch, 0, ch.length);
			a.flush();
			if (a != null) {
				a.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 1.创建E:\\myio目录
		ml(file);
		// 2.创建E:\\myio\\write.txt文件
		wj(file1);
		// 3.使用read()的方法读取E:\\myio\\write.txt的文本字符
		sc1(file1);
		// 4.使用Read(char[] c)的方法读取E:\\myio\\write.txt的文本字符
		sc2(file1);
		// 5.使用Read(char[] c，int off,int len)的方法读取E:\\myio\\write.txt的文本字符
		sc3(file1);
		// 6.创建E:\\myio\\write子目录
		ml(file2);
		// 7.创建E:\\myio\\write\\write.txt子文件
		wj(file3);
		// 8.使用write(String str)的方法把读取字符写入到D:\myio\write\write.txt文件中
		xr1();
		// 9.使用write(char ch[])的方法把读取字符写入到D:\myio\write\write.txt文件中
		xr2();
		// 10.使用write(String str,int
		// off,intlen)的方法把读取字符写入到D:\myio\write\write.txt文件中
		xr3();
	}

}
