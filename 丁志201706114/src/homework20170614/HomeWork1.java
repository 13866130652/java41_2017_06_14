package homework20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

/**
 * 1、使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
 * 2、使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。 3、所有的文件、目录要求使用File语句进行创建。
 * 
 */
public class HomeWork1 {
	static File file = new File("D:\\myio\\write.txt");// 创建文件对象
	static File dir = new File("D:\\myio");// 创建文件对象
	static File file1 = new File("D:\\myio\\write\\write.txt");
	static File dir1 = new File("D:\\myio\\write");// 创建文件对象

	public static void main(String[] args) {
		char ch[] = new char[7];
		char ch1[] = new char[8];
		CJML(dir);
		CJML(dir1);
		CJWJ(file);
		CJWJ(file1);
		Write1("我爱北京天安门", "D:\\myio\\write\\write.txt");
		Write2("可惜天安门不爱我", "D:\\myio\\write.txt", 0, 8);
		Reader3("D:\\myio\\write\\write.txt", ch, 0, 7);
		Reader1("D:\\myio\\write.txt");
		Reader2(file.toString(), ch1);
	}

	public static void CJML(File f) {
		if (!f.exists()) {// 如果文件夹不存在
			if (f.mkdirs()) {// 如果创建成功
				System.out.println("创建文件夹成功");
			} else {
				System.out.println("创建文件夹失败");
			}
		} else {
			System.out.println("目录已存在");
		}
	}

	public static void CJWJ(File f) {
		if (!f.exists()) {
			try {
				if (f.createNewFile()) {
					System.out.println("创建文件成功");
				} else {
					System.out.println("创建失败");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("文件已存在");
		}
	}

	// 使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。
	public static void Write1(String s, String s2) {
		Writer fw = null;// 创建Writer对象
		try {
			fw = new FileWriter(s2);
			fw.write(s);// 把实参中的数据写到对象中
			fw.flush();// 刷新缓冲区
			System.out.println("写入成功");
		} catch (Exception e) {
			System.out.println("文件不存在");
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Write2(String nr, String wj, int off, int len) {
		Writer fw = null;// 创建Writer对象
		try {
			fw = new FileWriter(wj);
			fw.write(nr, off, len);// 将str字符串里从off位置开始长度为len的字符输出到输出流中
			fw.flush();// 刷新缓冲区
			System.out.println("写入成功");
		} catch (Exception e) {
			System.out.println("文件不存在");
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
	public static void Reader1(String wj) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader(wj);
			char ch[] = new char[8];// 创建字符数组作为中转站
			sbf = new StringBuffer();// 创建StringBuffer对象
			int length = 0;// 将字符读入数组
			while (fr.read(ch) != -1) {// 当length不等于-1
				length = fr.read();// 读取单个字符
				sbf.append(ch);// 拼接字符
			}
			System.out.println(sbf);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Reader2(String wj, char ch[]) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader(wj);
			sbf = new StringBuffer();// 创建StringBuffer对象
			int length = 0;// 将字符读入数组
			while (fr.read(ch) != -1) {// 当length不等于-1
				length = fr.read();// 读取单个字符
				sbf.append(ch);// 拼接字符
			}
			System.out.println(sbf);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void Reader3(String wj, char ch[], int off, int len) {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader(wj);
			sbf = new StringBuffer();// 创建StringBuffer对象
			fr.read(ch, off, len);// 读取单个字符
			System.out.println(ch);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
