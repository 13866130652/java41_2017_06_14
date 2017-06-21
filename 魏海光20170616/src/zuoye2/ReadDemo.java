package zuoye2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadDemo {
	private static File f = new File("D:\\myio\\write.txt");
	private static Reader rd = null;

	public static void Read1() {
		Reader fr = null;
		StringBuffer sbf = null;
		try {
			fr = new FileReader("D:\\myio\\write.txt");
			char ch[] = new char[1024];
			sbf = new StringBuffer();
			int length = 0;
			String d = "";
			while ((length = fr.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					d += ch[i];
				}
			}
			System.out.println(d);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	public static void Read2() {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\myio\\write.txt");
			// 调用read方法输出到控制台上
			int len = 0;
			try {
				while ((len = fr.read()) != -1) {
					System.out.print((char) len);

				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void Read3() {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 创建一个FileReader对象
			fr = new FileReader("D:\\myio\\write.txt");
			// 创建一个BufferReader对象
			br = new BufferedReader(fr);
			// 读取一行数据
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("文件不存在");
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void Write1(File file) {
		FileOutputStream fos = null;
		try {
			String str = "我在青鸟学习";
			byte[] words = str.getBytes();
			fos = new FileOutputStream("D:\\myio\\write.txt", true);
			// 创建流对象，以追加方式写入文件
			fos.write(words);
			System.out.println("文件已更新");
		} catch (IOException e) {
			System.out.println("创建文件时出错");
			// TODO: handle exception
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Read1();
		Read2();
		Read3();
	}

}
