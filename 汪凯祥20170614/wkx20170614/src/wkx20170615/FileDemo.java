package wkx20170615;

import java.io.File;
import java.io.IOException;

/**
 * 所有的文件、目录要求使用File语句进行创建。
 *
 */
public class FileDemo {
	private static File f = new File("D:/myfile/mydoc/java");
	private static File f1 = new File("D:/myfile/mydoc/java/file.txt");

	// 创建文件目录
	public static void creat1() {
		if (!f.exists()) {
			f.mkdirs();
			System.out.println("目录创建成功");
		} else {
			System.out.println("目录已存在");
		}
	}

	// 创建文件
	public static void creat2() {
		if (!f1.exists()) {
			try {
				f1.createNewFile();
				System.out.println("文件创建成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("文件已存在");
		}
	}

	public static void main(String[] args) {
		creat1();
		creat2();

	}

}
