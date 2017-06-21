package cn.bdqn.work_20170610;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class FileDemo {
	// file 类方法集合
	private static File f = new File("E:/java1/Chuangyi - 副本.txt");

	// private static File f1 = new File("E:\\java1\\Chuangyi.txt");
	// 1.判断文件和目录是否存在
	public static boolean exisit() {
		return f.exists();
	}

	// 2.判断是不是文件
	public static boolean isFile() {
		return f.isFile();
	}

	// 3.判断是不是目录
	public static boolean ifDirextory() {
		return f.isDirectory();
	}

	// 4.返回对象的相对路径名
	public static String getPath() {
		return f.getPath();
	}

	// 5.获得绝对路径
	public static String getAbsolutePath() {
		return f.getAbsolutePath();
	}

	// 6.getname获得文件Munu的名称
	public static String getName() {
		return f.getName();
	}

	// 7.删除文件或Munu
	public static boolean delete() {
		return f.delete();
	}

	// 8.创建新文件不是文件夹
	public static boolean createNewFile() {
		try {
			return f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	// 9.文件字节大小
	public static long getLength() {
		f.canExecute();
		return f.length();

	}

	// 10.文件是否可读
	public static boolean canRead() {

		return f.canRead();

	}

	// 11.文件是否可写
	public static boolean canWrite() {

		return f.canWrite();

	}

	// 12.是否是隐藏
	public static boolean isHidden() {
		return f.isHidden();
	}

	// 13.最后修改时间
	public static String lastModified() {
		Date d = new Date(f.lastModified());
		DateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return f.format(d);
	}

	// 14.获得指定目录下的所有文件递归
	public static void getFiles(String path) {
		// int count = 0;
		// int sum = 0;
		f = new File(path);
		// 创建文件对象
		// 判断是不是文件还是文件夹
		if (f.isFile()) {
			// 是文件输出文件的绝对路径
			System.out.println(f.getAbsolutePath());
			// count++;
		}
		// return;
		// }else{
		// File[]files=f.listFiles();
		// f = new File(path);
		else {
			// 不是文件，取到目录中的所有文件对象，作为数组元素
			File[] files = f.listFiles();
			// 增强for遍历数组
			for (File file : files) {
				// 判断是不是文件
				if (file.isFile()) {
					// 是文件输出文件绝对路径
					System.out.println(file.getAbsolutePath());
					// count++;
					// sum += file.length();
				} else {
					// 不是文件取到files数组中对应的目录途径，作为参数进行递归操作
					getFiles(file.getAbsolutePath());
				}
			}
		}
		// System.out.println("文件数总量" + count + ",总容量：" + sum);
	}

	// 目录文件个数没输出子目录下的文件
	public static void getLength1(String directory) {
		f = new File(directory);
		File files[] = f.listFiles();
		System.out.println(files.length);
	}

	// 17.获得父级目录
	public static String getParent(String path) {
		File file = new File(path);
		String st = file.getParent();
		return st;
	}

	// 18.获得父级文件
	public static File getParentFile(String path) {
		File file = new File(path);
		return file.getParentFile();
	}

	public static void main(String[] args) {
		System.out.println("********文件是否存在*********");
		System.out.println(exisit());
		System.out.println("********是否是文件*********");
		System.out.println(isFile());
		System.out.println("********文件是否是目录*********");
		System.out.println(ifDirextory());
		System.out.println("********文件相对路径名*********");
		System.out.println(getPath());
		System.out.println("********文件绝对路径名*********");
		System.out.println(f.getAbsolutePath());
		System.out.println("********获得文件Munu的名称*********");
		System.out.println(getName());
		System.out.println("********文件删除*********");
		// System.out.println(f.delete());
		System.out.println("********文件创建*********");
		// System.out.println(createNewFile());
		System.out.println("********文件字节大小*********");
		System.out.println(getLength());
		System.out.println("********文件是否可读********");
		System.out.println(canRead());
		System.out.println("********文件是否可写*********");
		System.out.println(canWrite());
		System.out.println("********文件是否隐藏*********");
		System.out.println(isHidden());
		System.out.println("********文件最后修改时间*********");
		System.out.println(lastModified());
		System.out.println("*********获得指定目录下的所有文件递归*********");
		// getFiles("E:/java1");
		// getLength1("E:/java1");
		// getFiles("E:/java1");
		// System.out.println("E:/java1");
		// System.out.println("**************getParentFile(String
		// path)*************");
		// File file = getParentFile("E:/java1/Chuangyi - 副本.txt");
		// file.isFile();
		// file.length();
		// if (file.isDirectory()) {
		// for (String fe : file.list()) {
		// System.out.println(fe);
		// }
		// }
	}
}
