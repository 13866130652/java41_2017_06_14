package cn.zuoye3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterReader;
import java.io.IOException;

public class ReaderDemo {
	/**
	 * Reader第一种方法 单个读
	 * 
	 * @param f
	 */
	public static void getRead1(File f) {
		FileReader fr = null;
		String s = "";
		try {
			fr = new FileReader(f);
			int d = 0;
			while ((d = fr.read()) != -1) {
				s = s + (char) d;
			}
			System.out.println("读取成功：" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Reader第二种方法 利用数组缓存
	 * 
	 * @param f
	 */
	public static void getRead2(File f) {
		FileReader fr = null;
		String s = "";
		char[] ch = new char[1024];
		try {
			fr = new FileReader(f);
			int d = 0;
			while ((d = fr.read(ch)) != -1) {
				for (int i = 0; i < d; i++) {
					s = s + ch[i];
				}
			}
			System.out.println("读取成功：" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * Reader第三种方法 利用数组缓存
	 * 
	 * @param f
	 */
	public static void getRead3(File f) {
		FileReader fr = null;
		String s = "";
		char[] ch = new char[1024];
		try {
			fr = new FileReader(f);
			int d = 0;
			while ((d = fr.read(ch, 0, ch.length)) != -1) {
				for (int i = 0; i < d; i++) {
					s = s + ch[i];
				}
			}
			System.out.println("读取成功：" + s);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 读写1
	 * 
	 * @param a
	 * @param b
	 */
	public static void getWrite1(File a, File b) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader(a);
			fw = new FileWriter(b);
			int d = 0;
			while ((d = fr.read()) != -1) {
				fw.write(d);
			}
			System.out.println("复制成功");
			fw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 读写2
	 * 
	 * @param a
	 * @param b
	 */
	public static void getWrite2(File a, File b) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] ch = new char[1024];
		try {
			fr = new FileReader(a);
			fw = new FileWriter(b);
			int d = 0;
			while ((d = fr.read(ch)) != -1) {
				fw.write(ch);// 可能会出错，最后一个数组没有读满，还有上一次残留
			}
			fw.flush();
			System.out.println("复制成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 读写3
	 * 
	 * @param a
	 * @param b
	 */
	public static void getWrite3(File a, File b) {
		FileReader fr = null;
		FileWriter fw = null;
		char[] ch = new char[16];
		try {
			fr = new FileReader(a);
			fw = new FileWriter(b);
			int d = 0;
			String s = "";
			while ((d = fr.read(ch)) != -1) {
				fw.write(ch, 0, d);
			}
			fw.flush();
			System.out.println("复制成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 创建目录
	 * 
	 * @param m
	 */
	public static void cjml(File m) {
		if (!m.exists()) {
			m.mkdirs();
			System.out.println("创建目录成功");
		} else {
			System.out.println("目录已经存在");
		}
	}

	/**
	 * 创建文件
	 * 
	 * @param m
	 */
	public static void cjwj(File m) {
		boolean flag = false;
		if (!m.exists()) {
			try {
				flag = m.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (flag) {
				System.out.println("创建文件成功");
			} else {
				System.out.println("创建文件失败");
			}
		} else {
			System.out.println("文件已经存在");
		}
	}

	public static void xieru(File f, String s) {
		FileWriter fr = null;
		BufferedWriter bw = null;
		try {
			fr = new FileWriter(f);
			bw = new BufferedWriter(fr);
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		File f1 = new File("D:/读读写写");
		File f2 = new File("D:/读读写写/bobo.txt");
		File f3 = new File("D:/读读写写/lili.txt");
		String s = "正是江南好风景，落花时间又逢君";
		cjml(f1);// 创建目录
		cjwj(f2);// 创建文件
		xieru(f2, s);// 写入内容
		getRead3(f2);// 读取文件
		getWrite3(f2, f3);// 复制文件内容
	}

}
