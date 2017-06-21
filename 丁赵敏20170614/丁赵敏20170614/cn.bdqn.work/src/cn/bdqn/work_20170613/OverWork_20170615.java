package cn.bdqn.work_20170613;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OverWork_20170615 {
	// 1.创建输入输出流对象
	private static InputStream is = null;
	private static OutputStream os = null;
	// 1、创建缓冲数组
	private static byte b[] = new byte[1024];

	// 文件夹创建
	private static void wenjianjia(String path) {
		File file = new File(path);
		if (!file.exists()) {
			if (file.mkdirs()) {
				System.out.println("文件夹创建成功！");
			}
		} else {
			System.out.println("文件夹已经存在！");
		}
	}

	// 文件创建成功
	private static void chuangjian(String path) {
		File file = new File(path);
		if (!file.exists()) {
			try {
				if (file.createNewFile()) {
					System.out.println("文件创建成功！");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("文件已经存在！");
		}
	}

	// 存入数组
	private static void getin(String origin, String target) {
		try {
			is = new FileInputStream(origin);
			os = new FileOutputStream(target);
			int data = 0;
			while ((data = is.read(b)) != -1) {
				os.write(b, 0, data);
			}
			os.flush();
			System.out.println("已经完成存入！");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// 统计a的个数
	private static void getnum(String path, char ch) {
		int a = 0, b = 0;
		try {
			is = new FileInputStream(path);
			while ((a = is.read()) != -1) {
				if ((char) a == ch) {
					b++;
				}
			}
			System.out.println("a的个数是：" + b);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// 替换掉文件中的a
	private static void change(String path, String path1, String a, String c) {
		try {
			is = new FileInputStream(path);
			os = new FileOutputStream(path1);
			StringBuffer st = new StringBuffer();
			int data = 0;
			while ((data = is.read()) != -1) {
				st.append((char) data);
			}
			String st1 = st.toString().replace(a, c);
			b = st1.getBytes();
			os.write(b);
			os.flush();
			System.out.println("数据处理成功！");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		wenjianjia("E:\\myio1");
		chuangjian("E:\\myio1\\test.txt");
		getin("E:\\myio\\moben.txt", "E:\\myio1\\test.txt");
		chuangjian("E:\\myio1\\test1.txt");
		getin("E:\\myio1\\test.txt", "E:\\myio1\\test1.txt");
		getnum("E:\\myio1\\test.txt", 'a');
		change("E:\\myio1\\test.txt", "E:\\myio1\\text.txt", "a", "b");
	}

}
