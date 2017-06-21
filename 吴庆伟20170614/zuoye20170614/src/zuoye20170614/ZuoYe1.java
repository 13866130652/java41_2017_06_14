package zuoye20170614;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ZuoYe1 {

	// 创建输出流对象
	static Writer wt = null;

	// 创建目录
	public static void h() {
		File dir = new File("E:\\File");
		if (!dir.exists()) {
			dir.mkdir();
		} else {
			System.out.println("文件目录已存在");
		}
	}

	// 第一种方法
	public static void read1() {
		// 确定源文件
		File file = new File("E:\\File\\lala.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();// 检查是否有此文件
			} catch (Exception e) {
			}
		}

		char ch[] = new char[5];
		StringBuffer sb = new StringBuffer();
		try {
			wt = new FileWriter(file, true);// true表示拼接原有字符串
			String st = "英雄联盟,";
			wt.write(st);// 把字符串写入文件中
			wt.flush();// 清空缓存
			Reader rd = new FileReader(file);
			int length = 0;
			// rd来读取每次length长度的字符到ch数组中
			while ((length = rd.read(ch)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
					sb.append(ch[i]);
				}
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	// 第二种方法
	public static void read2() {
		// 1.确定源文件
		File file = new File("E:\\File\\lala.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (Exception e) {
			}
		}

		String st = "召唤师峡谷,";
		char ch[] = st.toCharArray();// 将字符串转化为字符数组
		Reader rd = null;
		try {
			wt = new FileWriter(file, true);
			wt.write(ch);
			wt.flush();
			rd = new FileReader(file);
			int date = 0;
			while ((date = rd.read()) != -1) {
				System.out.print((char) date);
			}
			System.out.println();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 第三种方法
	public static void read3() {
		File file = new File("E:\\File\\lala.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		String st = "断剑重铸之日，骑士归来之时！";
		char a[] = st.toCharArray();// 将字符串转化为字符数组
		char ch[] = new char[14];
		int length = 0;
		try {
			wt = new FileWriter(file, true);
			wt.write(a, 0, 14);// 从头开始，写长度为14的到a数组
			wt.flush();
			Reader rd = new FileReader(file);
			while ((length = rd.read(ch, 0, 14)) != -1) {
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 关闭资源
	public static void close() {
		try {
			wt.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		read1();
		read2();
		read3();
		close();
	}

}
