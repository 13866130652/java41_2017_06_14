package homework6_14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/*
 * 1、使用Reader的三种方法读取文件D:\myio\write.txt的文本字符，输出到控制台。
 * 2、使用Writer的三种方法把读取字符写入到D:\myio\write\write.txt文件中。
 * 3、所有的文件、目录要求使用File语句进行创建。
 */
public class Work1 {
	private static File file = new File("D:\\io流\\myio\\write.txt");
	private static File file1 = new File("D:\\io流\\myio\\write");
	private static File file2 = new File("D:\\io流\\myio\\write\\write.txt");
	private static Reader rd = null;
	private static Writer wt = null;
	private static char []ch=new char[1024];

	static {
		try {
			rd = new FileReader(file);
			wt = new FileWriter(file2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reader读取和Writer写入的方法（-）
	public static void read1() {
		int length = 0;
		try {
			while ((length = rd.read()) != -1) {
				System.out.print((char) length);
				wt.write(length);
				wt.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Reader读取和Writer写入的方法（二）
	public static void read2() {
		int length=0;
		try {
			while((length=rd.read(ch))!=-1){
				for (int i = 0; i < length; i++) {
					System.out.print(ch[i]);
					wt.write(ch[i]);
					wt.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Reader读取和Writer写入的方法（三）
	public static void read3() {
		int length=0;
		try {
			while((length=rd.read(ch,0,ch.length))!=-1){
				for(int i=0;i<length;i++){
					System.out.print(ch[i]);
					wt.write(ch[i]);
					wt.flush();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 创建文件和目录的方法
	public static void getFile() {
		// 创建D:\\io流\\myio下的write.txt文件
		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println(file.getName() + "创建成功！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.getName() + "已存在");
		}
		// 创建D:\\io流\\myio下的write目录
		if (!file1.exists()) {
			file1.mkdir();
			System.out.println(file1.getName() + "创建成功！");
		} else {
			System.out.println(file1.getName() + "已存在");
		}
		// 创建D:\\io流\\myio\\write下的write.txt文件
		if (!file2.exists()) {
			try {
				file2.createNewFile();
				System.out.println(file2.getName() + "创建成功！");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file2.getName() + "已存在");
		}
	}
	public static void close(){
		if(rd!=null&&wt!=null){
			try {
				rd.close();
				wt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		getFile();
//		read1();
//		read2();
		read3();
		close();
	}
}
