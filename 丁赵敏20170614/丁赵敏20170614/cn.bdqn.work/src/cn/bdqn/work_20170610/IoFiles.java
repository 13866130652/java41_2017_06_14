package cn.bdqn.work_20170610;

import java.io.File;

public class IoFiles {
	private static File f = new File("E:/待处理目录/file.txt");

	// 1.判断文件和目录是否存在
	public static boolean exisit() {
		return f.exists();
	}

	// 2.判断是不是文件
	public static boolean isFile() {
		return f.isFile();
	}

	// 3.返回对象的相对路径名
	public static String getPath() {
		return f.getPath();
	}

	// 4.文件字节大小
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

	public static void getFiles(String path) {
		f = new File(path);
		// 创建文件对象
		// 判断是不是文件还是文件夹
		if (f.isFile()) {
			// 是文件输出文件的绝对路径
			System.out.println(f.getAbsolutePath());
		} else {
			// 不是文件，取到目录中的所有文件对象，作为数组元素
			File[] files = f.listFiles();
			// 增强for遍历数组
			for (File file : files) {
				// 判断是不是文件
				if (file.isFile()) {
					// 是文件输出文件绝对路径
					System.out.println(file.getAbsolutePath());
				} else {
					getFiles(file.getAbsolutePath());
				}
			}
		}
	}

	// 获得父级目录下所有文件
	public static File getParentFile(String path) {
		File file = new File(path);
		return file.getParentFile();
	}

	// 统计Java文件
	public static int getJava(String path) {
		int sum = 0;
		if (path.endsWith(".java")) {
			sum++;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("************exisit()判断文件和目录是否存在**************");
		System.out.println(exisit());
		System.out.println("************isFile()判断是不是文件**************");
		System.out.println(isFile());
		System.out.println("*************getPath()返回对象的相对路径名*************");
		System.out.println(getPath());
		System.out.println("*************getLength()文件字节大小*************");
		System.out.println(getLength());
		System.out.println("************canRead()文件是否可读**************");
		System.out.println(canRead());
		System.out.println("*************canWrite()文件是否可写*************");
		System.out.println(canWrite());
		System.out.println("**************getParentFile(String path)*************");
		File file = getParentFile("E:/file - 副本.txt");
		file.isFile();
		file.length();
		if (file.isDirectory()) {
			for (String fe : file.list()) {
				System.out.println(fe);
			}
		}
		System.out.println(getJava("E:/待处理目录"));

	}

}
