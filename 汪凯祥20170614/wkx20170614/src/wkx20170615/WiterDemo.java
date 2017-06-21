package wkx20170615;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * 使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。
 *
 */
public class WiterDemo {
	private static File f = new File("D:\\myio\\write.txt");
	private static Writer wt = null;

	// 字符串
	public static void witer1() {
		try {
			wt = new FileWriter(f, true);
			String st = "《滕王阁序》王勃";
			wt.write(st);
			wt.flush();
			wt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 字符数组
	public static void witer2() {
		try {
			wt = new FileWriter(f, true);
			String st = "《滕王阁序》王勃";
			char ch[] = st.toCharArray();
			wt.write(ch);
			wt.flush();
			wt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 字符区间
	public static void witer3() {
		try {
			wt = new FileWriter(f, true);
			String st = "《滕王阁序》王勃";
			char ch[] = st.toCharArray();
			wt.write(ch, 0, ch.length);
			wt.flush();
			wt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// witer1();
		// witer2();
		witer3();

	}

}
