package zuoye0613;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class IoDemos {
	private static File file = new File("D:/myio");
	private static File f = new File("D:/myio/test.txt");
	private static File f1 = new File("D:/myio/input/test1.txt");
	private static File f2 = new File("D:/myio/input/test2.txt");
	private static InputStream s = null;
	private static OutputStream s1 = null;
	private static OutputStream s2 = null;
	private static byte[] b = new byte[1024];
	static {
		try {
			s = new FileInputStream(f);
			s1 = new FileOutputStream(f1);
			s2 = new FileOutputStream(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 将字符串写入到目标数据源中
	public static void write(String str) {
		StringBuffer sb = new StringBuffer(str);
		int num = 0;
		try {
			while ((num = s.read(b)) != -1) {
				for (int i = 0; i < num; i++) {
					char ch = (char) b[i];
					sb.append(ch);
				}
			}
			// 先将test.txt文件中的内容转化成字符串
			String st = new String(sb);
			// 将字符串转化成byte[]数组进行写入
			byte[] h = st.getBytes();
			s1.write(h);
			s1.flush();// 清除缓存
			System.out.println("写入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 创建文件夹myio
	public static void getMyio() {
		if (!file.exists()) {
			file.mkdir();
			System.out.println("创建目录成功");
		} else {
			System.out.println("目录已存在");
		}
	}

	// 创建文本test.txt
	public static void getTest() {
		if (f.exists()) {
			System.out.println("文件已存在");
		} else {
			try {
				f.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("创建成功");
		}
	}

	// 统计test.txt文件的‘a’字数
	public static void getA(char c) {
		int length, num = 0;
		try {
			while ((length = s.read(b)) != -1) {
				System.out.println(new String(b, 0, length));
				for (int i = 0; i < length; i++) {
					char ch = (char) b[i];
					if (ch == c) {
						num++;
					}
				}
			}
			System.out.println();
			System.out.println(c + "出现了" + num + "次");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 把test.txt中的‘a’字符转换成‘b’输出到D:\myio\input\test2.txt中
	public static void change(String o, String n) {
		StringBuffer sb = new StringBuffer();
		int num = 0;
		try {
			while ((num = s.read(b)) != -1) {
				for (int i = 0; i < num; i++) {
					char ch = (char) b[i];
					System.out.print(ch);
					sb.append(ch);
				}
			}
			String st = new String(sb);
			st = st.replaceAll(o, n);
			System.out.println(st);
			// 将test.txt的内容转化成byte[]数组后进行写入到test2.txt中
			byte[] x = st.getBytes();
			s2.write(x);
			s2.flush();
			System.out.println("成功写入到test2.txt中");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 关闭
	public static void close() {
		if (s != null) {
			try {
				s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		String st1="A local teenager has replaced all her digital tracks with vinyl. \"It's really groovy,\""
				+ " she said, on the record. Without skipping a beat, she added, \"Besides, it's like going through a time warp.\""+

"Some of her iPod-toting classmates aren't as enthusiastic. \"Yeah, they needle me about it. What a bunch of ones and zeros.\"";
		getMyio();
		getTest();
		getA('a');
		change("a", "b");
		 write(st1);
		close();

	}

}
