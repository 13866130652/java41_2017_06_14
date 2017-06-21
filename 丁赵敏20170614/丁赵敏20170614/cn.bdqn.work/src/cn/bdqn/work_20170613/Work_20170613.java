package cn.bdqn.work_20170613;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Work_20170613 {
	// 1、确定源数据源
	private static File fileOrigin = new File("E:\\myio\\test.txt");
	// 2、目标数据源
	private static File fileTarget = new File("E:\\myio\\test1.txt");
	// 3、创建输入、输出流对象
	private static InputStream is = null;
	private static OutputStream os = null;
	// 4、 字节缓冲数组，把读取到的数据存放到b数组中
	private static byte b[] = new byte[1024];

	static {
		try {
			is = new FileInputStream(fileOrigin);
			os = new FileOutputStream(fileTarget, true);// 不覆盖原来内容
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 5、传输数据
	public static void translate() {
		int date = 0;
		try {
			while ((date = is.read(b)) != -1) {
				os.write(b, 0, date);
			}
			os.flush();// 清空缓存
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("已经完成！");
		}
	}

	public static void create() {
		File dir = new File("E:\\myio");
		if (!dir.exists()) {
			dir.mkdir();
		}
		// 创建文件
		File file = new File("E:\\myio");
		boolean flag = false;
		if (!file.exists()) {
			try {
				flag = file.createNewFile();
			} catch (Exception e) {

			}
		}
		if (flag) {
			System.out.println("创建成功！");
		} else {
			System.out.println("创建失败！");
		}
		String newName = "\\test1.txt";
		file.renameTo(new File(dir.getPath() + newName));
	}

	public static int getNum(char ch) {
		File f = new File("E:\\myio\\test.txt");
		InputStream is = null;
		try {
			is = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int x = 0, y = 0;
		try {
			while ((x = is.read()) != -1) {
				if ((char) x == ch) {
					y++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return y;
	}

	public static void main(String[] args) {
		create();
		System.out.println(getNum('a'));
		translate();
		try {
			os = new FileOutputStream("e:\\myio\\test2.txt");
			StringBuffer sb = new StringBuffer("");
			int date = 0;
			is = new FileInputStream("e:\\myio\\test.txt");
			while ((date = is.read()) != -1) {
				sb.append((char) date);
			}
			String s = sb.toString();
			s = s.replace('a', 'b');
			byte[] b = s.getBytes();
			os.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
